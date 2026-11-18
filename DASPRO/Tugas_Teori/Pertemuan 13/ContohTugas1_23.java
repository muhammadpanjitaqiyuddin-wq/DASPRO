public class ContohTugas1_23 {
    public static void main(String[] args) {
        

        int[][] penjualan = {
            {2, 8, 6, 0},
            {7, 3, 6, 0},
            {4, 6, 5, 0},
            {0, 0, 0, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                penjualan[i][3] += penjualan[i][j];
            }
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                penjualan[3][j] += penjualan[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            penjualan[3][3] += penjualan[i][3];
        }

        System.out.println("TABEL PENJUALAN TOGAMAS");
        System.out.println("============================");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
