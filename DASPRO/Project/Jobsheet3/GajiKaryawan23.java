import java.util.Scanner;

public class GajiKaryawan23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.println("Masukkan Gaji Pokok = ");
        gajiPokok = sc.nextInt();
        bonus = 0.05 * gajiPokok;
        totGaji =  gajiPokok + tunjTransp + tunjMkn + bonus - 0.1 * gajiPokok;
         
        System.out.println("Bonus Bulanan Anda Adalah : " + bonus);
        System.out.println("Gaji Yang Di terima adalah :  " + (int) totGaji);

         sc.close();
    }
}
