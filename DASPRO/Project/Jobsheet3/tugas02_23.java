import java.util.Scanner;
public class tugas02_23 {
    
    public static void main(String[] args){
       
        int x  = 50; //Lembar
        int Perlembar = 500;
        int Jilid = 5000;

        int totalAwal = Perlembar * x; // totalBiayaCetak = biayaPerlembar * Jumlah Lembar
        int totalAkhir = totalAwal + Jilid; // totalBayar = totalBiayaCetak + BiayaJilid

        Scanner sc = new Scanner (System.in);
        

        System.out.println(" ---- PERHITUNGAN BIAYA CETAK DOKUMEN ---- ");
        System.out.println("Jumlah Lembar Dokumen  : " + x + " Lembar");
        System.out.println( "Biaya Cetak Perlembar   : Rp " + Perlembar);
        System.out.println("Biaya Penjilidan        : Rp " + Jilid);
        System.out.println("-------------------------------------------");
        System.out.println("Total Biaya Cetak       : Rp " + totalAwal);
        System.out.println("Total Harus Dibayar     : Rp " + totalAkhir);


        System.out.print("Masukkan lembar sendiri = " );
    
        x = sc.nextInt();
        System.out.println("Jumlah Lembar Dokumen  : " + x + " Lembar");
        System.out.println( "Biaya Cetak Perlembar   : Rp " + Perlembar);
        System.out.println("Biaya Penjilidan        : Rp " + Jilid);
        System.out.println("-------------------------------------------");
        System.out.println("Total Biaya Cetak       : Rp " + totalAwal);
        System.out.println("Total Harus Dibayar     : Rp " + totalAkhir);



      
    }
}
