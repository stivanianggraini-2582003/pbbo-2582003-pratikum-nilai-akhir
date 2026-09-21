import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Konstanta bobot penilaian dan input nilai
        final double BOBOT_PRAKTIKUM = 0.30;
        final double BOBOT_TUGAS = 0.20;
        final double BOBOT_MID = 0.20;
        final double BOBOT_FINAL = 0.30;

        System.out.print("Masukkan nilai Praktikum: ");
        double praktikum = scanner.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Masukkan nilai MID: ");
        double mid = scanner.nextDouble();

        System.out.print("Masukkan nilai Final: ");
        double nilaiFinal = scanner.nextDouble();

        // Menghitung nilai akhir, pembulatan, dan selisih
        double akhir = praktikum * BOBOT_PRAKTIKUM
                + tugas * BOBOT_TUGAS
                + mid * BOBOT_MID
                + nilaiFinal * BOBOT_FINAL;

        // Percobaan menggunakan int menghasilkan nilai yang berbeda
        // karena pembagian bilangan bulat.
        // int hasilInt = praktikum * 30 / 100;

        int dibulatkan = (int) Math.round(akhir);
        double selisih = akhir - dibulatkan;

        // Augmented assignment
        akhir += 0;
    }
}