import java.util.Scanner;
public class kafe2_23 {
    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16 ) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        }

    
        public static void main(String[] args) {

        // Membuat Scanner untuk membaca input keyboard
        Scanner input = new Scanner(System.in);

        // Meminta input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        // Meminta input status member
        System.out.print("Apakah Anda member? (y/n): ");
        String statusMember = input.nextLine();

        // Mengubah jawaban y/n menjadi boolean
        boolean isMember = statusMember.equalsIgnoreCase("y");

        System.out.print("Masukkan jam kunjungi (0-23): ");
        int jam = input.nextInt();

        // Memanggil fungsi Menu dengan 3 argumen
        Menu(nama, isMember, jam);

        }   
    }


    // public static void main(String[] args) {
    //     Menu("Budi", false);
    // }

    //MODIFIKASI menu();
    //     public static void main(String[] args) {
    //     Menu();
    // }

    // Modifikasi menu(true, "Andi")
    //  public static void main(String[] args) {
    //     Menu(true, "Andi");
    // }
// }