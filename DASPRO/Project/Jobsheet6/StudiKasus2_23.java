package DASPRO.Project.Jobsheet6;
import java.util.Scanner;

public class StudiKasus2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara;
        int statusPendanaanPkm;

        System.out.print("Nama Mahasiswa\t: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis Kegiatan\t: ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah Dokumen\t: ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat Juara\t: ");
        peringkatJuara = sc.nextInt();
        System.out.print("Status Pendanaan PKM : ");
        statusPendanaanPkm = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma")
                || jenisKegiatan.equalsIgnoreCase("mandiri") || jenisKegiatan.equalsIgnoreCase("pkm")
                || jenisKegiatan.equalsIgnoreCase("pimnas") || jenisKegiatan.equalsIgnoreCase("danLainnya")) {
                    
            System.out.println("peringkat juara: " + peringkatJuara);
            peringkatJuara = sc.nextInt();

            if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {
        
            if (jumlahDokumen >=4) {
                System.out.println("dana pengharganan diberikan kepada mahasiswa " + namaMahasiswa);
            } else {
                jumlahDokumen = 4 - jumlahDokumen;
                System.out.println("dokumen tidak lengakap(kurang" + jumlahDokumen + " dokumen). Dana penghargaan tidak diberikan kepada mahasiswa " + namaMahasiswa);
            }
            
            } else {
                System.out.println("tidak memperoleh penghargaan(hanya untuk juara 1/2/3).");
            }
        }
        
        else if (jenisKegiatan.equalsIgnoreCase("pkm")) {

            System.out.print("Status Pendanaan (1/0): ");
            statusPendanaanPkm = sc.nextInt();

            if (statusPendanaanPkm == 1) {
                System.out.println("dana pengharganan diberikan kepada mahasiswa " + namaMahasiswa);
            } else {
                System.out.println("pendanaan PKM tidak diterima. Dana penghargaan tidak diberikan kepada mahasiswa " + namaMahasiswa);
            }
        } else {
            System.out.println("tidak memperoleh dana penghargaan (Jenis kegiatan tidak valid).");
        }
    }
}