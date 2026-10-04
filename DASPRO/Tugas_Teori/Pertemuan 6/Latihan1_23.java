import java.util.Scanner;

public class Latihan1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Masukkan Bilangan Ke - 1 : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan Bilangan Ke - 2 : ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan Bilangan Ke - 3 : ");
        int bil3 = sc.nextInt(); 

        int terbesar;

        // Menggunakan if-else bersarang (nested if) tanpa operator logika (&& / ||)
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }

        // Menampilkan hasil
        System.out.println("Bilangan terbesar adalah : " + terbesar);
    }
}