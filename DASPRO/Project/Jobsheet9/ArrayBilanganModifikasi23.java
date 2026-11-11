// import java.util.Arrays;

// public class ArrayBilanganModifikasi23 {
//     public static void main(String[]args) {

//         int[] bil = {5, 13, -7, 17};
        
//         for (int i = 0; i < bil.length; i++) { 
//             System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2)); 
//         }   
//         for (int nilai : bil) { 
//             System.out.println(nilai); 
//         } 
//         System.out.println(Arrays.toString(bil));    
//     }
// }

import java.util.Arrays;

public class ArrayBilanganModifikasi23 {
    public static void main(String[] args) {
        // Soal 2: inisialisasi langsung saat deklarasi
        int[] bil = {5, 13, -7, 17};

        System.out.println("=== Soal 2: inisialisasi langsung ===");
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // Soal 3: tambah tampilan nilai x 2
        System.out.println("\n=== Soal 3: tampilkan nilai dan double ===");
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }

        // Soal 4: kondisi i <= 4 -> error karena indeks 4 tidak ada
        System.out.println("\n=== Soal 4: kondisi i <= 4 ===");
        try {
            for (int i = 0; i <= 4; i++) {
                System.out.println("bil[" + i + "] = " + bil[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n" + Arrays.toString(bil));
    }
}
