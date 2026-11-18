//Modifikasi Soal No. 2
// import java.util.Arrays;

// public class Numbers_23 {

//     public static void main(String[] args) {
//         int[][] myNumbers = new int[3][];
//             myNumbers[0] = new int[5];
//             myNumbers[1] = new int[3];
//             myNumbers[2] = new int[1];

//     for (int i = 0; i < myNumbers.length; i++) {
//        System.out.println(Arrays.toString(myNumbers));
       
//     }  
       
//    }   
// }

//Modifikasi Soal No.3
// import java.util.Arrays;

// public class Numbers_23 {

//     public static void main(String[] args) {
//         int[][] myNumbers = new int[3][];
//             myNumbers[0] = new int[5];
//             myNumbers[1] = new int[3];
//             myNumbers[2] = new int[1];

//     for (int i = 0; i < myNumbers.length; i++) {
//        System.out.println(Arrays.deepToString(myNumbers));
       
//     }  
       
//    }   
// }


// //Modifikasi Soal No.5

// public class Numbers_23 {

//     public static void main(String[] args) {
//         int[][] myNumbers = new int[3][];
//             myNumbers[0] = new int[5];
//             myNumbers[1] = new int[3];
//             myNumbers[2] = new int[1];

//     for (int i = 0; i < myNumbers.length; i++) {
//         System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
//     }       
//    }   
// }

//Modifikasi Soal No.7
import java.util.Arrays;
public class Numbers_23 {

    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
            myNumbers[0] = new int[5];
            myNumbers[1] = new int[3];
            myNumbers[2] = new int[1];
            myNumbers[0] = new int[7];

        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);

    for (int i = 0; i < myNumbers.length; i++) {
        System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
    }       
//    }   
// }

//Modifikasi DISKUSI
//  public class Numbers_23 {

//     public static void main(String[] args) {


        // Diskusi No. 1: Salinan referensi
        // int[][] salinan = myNumbers;
        // salinan[0][0] = 99;
        // System.out.println(myNumbers[0][0]); // 99 (ikut berubah)

        // Diskusi No. 2: Deep Copy
        int[][] deep = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            deep[i] = Arrays.copyOf(myNumbers[i], myNumbers[i].length);
        }
        deep[0][0] = 5;
        System.out.println(myNumbers[0][0]); // tetap 99 (tidak ikut berubah)

        int[][] kloning = myNumbers.clone(); // shallow copy
        kloning[0][0] = 77;
        System.out.println(myNumbers[0][0]); // 77 (ikut berubah!)
    }
}