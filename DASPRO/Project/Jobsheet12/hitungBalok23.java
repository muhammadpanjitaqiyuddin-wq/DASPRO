
// import java.util.Scanner;

// public class hitungBalok23 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int p, l, t, L, vol;

//         System.out.print("Masukkan Panjang = ");
//         p = input.nextInt();

//         System.out.print("Masukkan Lebar = ");
//         l = input.nextInt();

//         System.out.print("Masukkan Tinggi = ");
//         t = input.nextInt();

//         L = p * l;
//         System.out.println("Luas Persegi Panjang Adalah " + L);
//         vol = p * l * t;
//         System.out.println("Volume Balok Adalah " + vol);

//         input.close();

//     }
// }

//DENGAN FUNGSI
//Dengan Fungsi (`hitungLuas`, `hitungVolume`, dan `main`)

// import java.util.Scanner;

// public class hitungBalok23 {
//     static int hitungLuas(int pjg, int lb) {
//         int Luas = pjg * lb;
//         return Luas;
//     }

//     static int hitungVolume(int tinggi, int a, int b) {
//         int volume = hitungLuas(a, b) * tinggi;
//         return volume;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int p, l, t, L, vol;

//         System.out.print("Masukkan panjang  = ");
//         p = input.nextInt();

//         System.out.print("Masukkan lebar    = ");
//         l = input.nextInt();

//         System.out.print("Masukkan tinggi   = ");
//         t = input.nextInt();

//         L = hitungLuas(p, l);
//         System.out.println("Luas Persegi Panjang adalah " + L);

//         vol = hitungVolume(t, p, l);
//         System.out.println("Volume Balok adalah " + vol);
//         input.close();
//     }
// }


// MODIFIKASI SOAL NO. 4 PERCOBAAN 5
import java.util.Scanner;

public class hitungBalok23 {

    static int hitungLuas(int pjg, int lb){
        int Luas = pjg * lb;

        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas (a,b) * tinggi;

        return volume;
    }
    // fungsi hitungLuasPermukaanBalok
    static int hitungLuasPermukaanBalok (int p, int l, int t){
        return 2 * (hitungLuas(p,l) + hitungLuas (p,t) + hitungLuas (l,t));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <=3; i++){
            System.out.println("=== Balok ke - " + i + " ====");

            int p, l, t, L, vol;

            System.out.print("Masukkan panjang : ");
            p = input.nextInt();

            System.out.print("Masukkan Lebar : ");
            l = input.nextInt();

            System.out.print("Masukkan Tinggi : ");
            t = input.nextInt();

            L = hitungLuas(p, l);
            System.out.println("Luas persegi panjang adalah " + L);
            vol = hitungVolume(t,p,l);
            System.out.println("Volume balok adalah " + vol);
            System.out.println("Luas Permukaan Balok adalah " + hitungLuasPermukaanBalok(p,l,t));
        }

    }
}
