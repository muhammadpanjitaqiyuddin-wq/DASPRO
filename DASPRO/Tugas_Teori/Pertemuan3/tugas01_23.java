

public class tugas01_23 {
    
    public static void main(String[] args){
        //Deklarasi Variabel
        int x  = 15000000; //HargaLaptop
        double y = 1000000; //UangMuka
        int z = 15; //lamaCicilan

        double bunga = 0.02; //Bunga
        
        double sisaHarga = x - y;
        double hasilBagi = sisaHarga /z;
        double hasilBunga = bunga * sisaHarga;
        double JumlahBayar = hasilBagi + hasilBunga;
        
        System.out.println(" --- PERHITUNGAN CICILAN LAPTOP ---");
        System.out.println("Harga Laptop       : Rp " + x);
        System.out.println("Uang Muka (DP)     : Rp " + y);
        System.out.println("Sisa Harga         : Rp " + (int) sisaHarga);
        System.out.println("Lama Cicilan       : " + z + " bulan");
        System.out.println("Bunga per Bulan    : 2%");
        System.out.println("---------------------------------");
        System.out.println("Cicilan Per  Bulan : Rp "  + (int) JumlahBayar);
  
    }
}
