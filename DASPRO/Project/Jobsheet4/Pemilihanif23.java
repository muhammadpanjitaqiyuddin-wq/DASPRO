
import java.util.Scanner;

public class Pemilihanif23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Cetak KRS SIAKAD ----- ");
        System.out.print( "Apakah UKT udah lunas? (True/False): ");
        boolean UKTLunas = sc.nextBoolean();

        if (UKTLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi Di Tolak");
            System.out.println("Silahkan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
}
