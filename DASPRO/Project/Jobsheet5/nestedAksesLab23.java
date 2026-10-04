import java.util.Scanner;

public class nestedAksesLab23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDiSanksi, punyaIzinDosen, asistenLab;

        System.out.print("Apakah mahasiswa Aktif (true/false) : ");
        mahasiswaAktif = scanner.nextBoolean();

        System.out.print("Apakah mahasiswa sedang di sanksi (true/false) :");
        sedangDiSanksi = scanner.nextBoolean();

        System.out.print("Apakah mahasiswa punya izin dosen (true/false) : ");
        punyaIzinDosen = scanner.nextBoolean();

        System.out.print("Apakah mahasiswa asisten LAB (true/false) : ");
        asistenLab = scanner.nextBoolean();

        if (mahasiswaAktif && !sedangDiSanksi){
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Laboratorium diberikan.");
            } else {
                System.out.println("Akses Lab ditolak : Mahasiswa membutuhkan izin dosen atau status asisten lab");
            } 
        } else {
            System.out.println("Akses mahasiswa ditolak : Mahasiswa tidak memenuhi syarat");
         }
        
        }
    }
