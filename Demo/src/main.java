public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama ="Monica";
        //mhs.nim ="105224042";
        System.out.println(mhs.nama);
        mhs.setNim("105224042");
        System.out.println(mhs.getNim());
        System.out.println(mhs.namaOr);
    }
}