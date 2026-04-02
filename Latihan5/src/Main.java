public class Main {
    public static void main(String[] args) {
     
        Karyawan mhsKaryawan = new Karyawan("ID124", "Monicaa");
        mhsKaryawan.setDepartemen("IT Support");

        System.out.println("Coba Masukkan Gaji Pokok Minus:");       
        mhsKaryawan.setGajiPokok(-1000); 

        System.out.println("\nMemperbaiki Input Gaji:");
        mhsKaryawan.setGajiPokok(5000000);

        System.out.println();
        mhsKaryawan.tampilkanDataKaryawan();
    }
}