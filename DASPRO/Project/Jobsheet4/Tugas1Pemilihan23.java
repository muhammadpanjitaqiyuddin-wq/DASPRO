
import java.util.Scanner;

public class Tugas1Pemilihan23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Cetak KRS SIAKAD ----- ");
        System.out.print( "Apakah UKT udah lunas? (True/False): ");
        boolean UKTLunas = sc.nextBoolean();

       String pesan = UKTLunas? "Pembayaran UKT terverifikasi \nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
       System.out.println(pesan);
    }
}
