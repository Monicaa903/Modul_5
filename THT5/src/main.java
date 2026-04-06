class Main {
    public static void main(String[] args) {
        KamarHotel kamar1 = new KamarHotel("101", "Suite", 2);
        KamarHotel kamar2 = new KamarHotel("202", "Premium", 2, 500000);

        kamar1.setTipeKamar("Presidential");
        kamar1.setHargaPerMalam(-10000);

        kamar2.pesanKamar(4);
        kamar2.pesanKamar(2);
        kamar2.pesanKamar();

        System.out.println("Tagihan Kamar 1: " + kamar1.hitungTotalBayar(2, "PROMO"));
        System.out.println("Tagihan Kamar 2: " + kamar2.hitungTotalBayar(4, "PROMO"));

        kamar1.tampilkanProfilKamar();
        kamar2.tampilkanProfilKamar();
    }
}