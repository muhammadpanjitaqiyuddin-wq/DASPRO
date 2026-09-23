import java.util.Scanner;

public class TugasAntrean23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan kode layanan : ");
    int layanan = input.nextInt();

    switch (layanan) {
      case 1:
        System.out.println("Layanan : Legalisir Ijazah");
        System.out.println("Loket : A");
        break;
      case 2:
        System.out.println("Layanan : Surat Keterangan Aktif Kuliah");
        System.out.println("Loket : B");
        break;
      case 3:
        System.out.println("Layanan : Pembayaran UKT");
        System.out.println("Loket : C");
        break;
      case 4:
        System.out.println("Layanan : Pengajuan Cuti Akademik");
        System.out.println("Loket : D");
        break;
      default:
        System.out.println("Kode layanan tidak valid");
    }
  }
}