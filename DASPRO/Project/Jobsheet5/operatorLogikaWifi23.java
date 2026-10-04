import java.util.Scanner;

public class operatorLogikaWifi23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean mahasiswa, dosen, akunDiBlokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = scanner.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = scanner.nextBoolean();
        System.out.print("Apakah akun diblokir? (true/false): ");
        akunDiBlokir = scanner.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiBlokir) {
            System.out.println("Akses WiFi diberikan.");
        } else {
            System.out.println("Akses WiFi ditolak.");
        }

    }
}