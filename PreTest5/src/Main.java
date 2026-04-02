import java.util.Scanner;

class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
            System.out.println("Saldo berhasil diperbarui melalui jalur resmi.");
        } else {
            System.out.println("Angka negatif ditolak oleh penjaga keamanan");
        }
    }

    public String getNomorRekening() {
        return nomorRekening;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkin Nomor Rekening: ");
        String noRek = input.nextLine();
        System.out.print("Masukkin Saldo Awal: ");
        double saldoAwal = input.nextDouble();

        RekeningBank akun = new RekeningBank(noRek, saldoAwal);

        System.out.println("\nAkses Jalur Resmi");
        System.out.print("Masukkin angka untuk memperbarui saldo: ");
        double inputSaldo = input.nextDouble();
        
        akun.setSaldo(inputSaldo);

        System.out.println("Data Akun: " + akun.getNomorRekening());
        System.out.println("Saldo Akhir: " + akun.getSaldo());

        input.close();
    }
}