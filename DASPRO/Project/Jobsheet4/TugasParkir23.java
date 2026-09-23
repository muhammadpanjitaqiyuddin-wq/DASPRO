import java.util.Scanner;

    public class TugasParkir23 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Output
        System.out.println("Masukkan lama parkir (JAM) : ");
        int jam = sc.nextInt();
        int tarif;
       
        
       if (jam <= 2) {   // jadi disini Jika lama parkir 2 jam atau kurang, tarif dipatok tetap sebesar Rp 2.000.
            tarif = 2000;
        } else {         // Jika lebih dari 2 jam, tarif dihitung dengan rumus seperti dibawah
            tarif = 2000 + (jam - 2) * 1000; 
        }

        System.out.println("Total tarif parkir: Rp " + tarif);
        }
    
    }


