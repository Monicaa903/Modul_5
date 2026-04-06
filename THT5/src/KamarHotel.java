public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = harga;
        this.isTersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Tipe Kamar Tidak Valid, Sistem Otomatis Memilih Reguler");
            this.tipeKamar = "Reguler";
        }
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam >= 50000) {
            this.hargaPerMalam = hargaPerMalam;
        } else {
            System.out.println("Harga di bawah batas minimal, Sistem otomatis diatur ke 50000");
            this.hargaPerMalam = 50000;
        }
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Berhasil: Kamar " + nomorKamar + " telah dipesan");
        } else {
            System.out.println("Peringatan: Kamar " + nomorKamar + " sudah terisi");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Peringatan: Kamar " + nomorKamar + " sudah terisi");
        } else if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Ditolak: Jumlah tamu (" + jumlahTamu + ") melebihi kapasitas (" + kapasitasMaksimal + ")!");
        } else {
            isTersedia = false;
            System.out.println("Berhasil: Kamar " + nomorKamar + " dipesan untuk " + jumlahTamu + " orang");
        }
    }

    public void batalPesan() {
        isTersedia = true;
        System.out.println("Berhasil! Pesanan kamar " + nomorKamar + " dibatalkan!");
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hargaPerMalam * jumlahMalam;
        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            return total * 0.8;
        } else {
            System.out.println("Voucher gagal digunakan! Syarat minimum malam tidak terpenuhi / kode salah.");
            return total;
        }
    }

    public void tampilkanProfilKamar() {
        System.out.println("No Kamar: " + nomorKamar);
        System.out.println("Tipe: " + tipeKamar);
        System.out.println("Kapasitas: " + kapasitasMaksimal);
        System.out.println("HargaPerMalam: " + hargaPerMalam);
        System.out.println("Status: " + (isTersedia ? "Tersedia" : "Terisi"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

