public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang("B001", "Komputer");

        barang.setHargaSatuan(-5000); 
        barang.kurangiStok(10); 

        barang.setKategori("Elektronik"); 
        barang.setHargaSatuan(15000000); 
        barang.tambahStok(20); 
        barang.kurangiStok(5); 

        barang.tampilkanDetailBarang(); 
    }
}