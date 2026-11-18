import java.util.Scanner;

public class Tugas_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print(" Pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Rata-rata per Responden ---");
        for (int i = 0; i < survei.length; i++) {
            int total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            double rata = (double) total / survei[i].length;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }

        System.out.println("\n--- Rata-rata per Pertanyaan ---");
        for (int j = 0; j < survei[0].length; j++) {
            int total = 0;
            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }
            double rata = (double) total / survei.length;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = (double) totalKeseluruhan / (survei.length * survei[0].length);
        System.out.println("\nRata-rata keseluruhan: " + rataKeseluruhan);
    }
} 
    

