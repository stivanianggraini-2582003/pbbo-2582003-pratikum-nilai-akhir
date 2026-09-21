import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Konstanta bobot untuk setiap komponen penilaian.
        final double BOBOT_PRAKTIKUM = 0.30;
        final double BOBOT_TUGAS = 0.20;
        final double BOBOT_MID = 0.20;
        final double BOBOT_FINAL = 0.30;

        // Input empat nilai menggunakan double agar nilai desimal dapat diterima.
        System.out.print("Nilai praktikum : ");
        double praktikum = scanner.nextDouble();

        System.out.print("Nilai tugas     : ");
        double tugas = scanner.nextDouble();

        System.out.print("Nilai MID       : ");
        double mid = scanner.nextDouble();

        System.out.print("Nilai final     : ");
        double finalNilai = scanner.nextDouble();
        // Perhitungan tidak membutuhkan kurung karena operator * dikerjakan lebih dahulu daripada +.
        double akhir = praktikum * BOBOT_PRAKTIKUM
                + tugas * BOBOT_TUGAS
                + mid * BOBOT_MID;

        // Augmented assignment digunakan untuk menambahkan nilai final.
        akhir += finalNilai * BOBOT_FINAL;

        // Jika menggunakan int, hasilnya 78 karena pembagian integer membuang bagian desimal.
        // Contoh: praktikum * 30 / 100 + tugas * 20 / 100 + mid * 20 / 100 + finalNilai * 30 / 100.

        // Pembulatan dilakukan secara eksplisit menggunakan casting ke int.
        int dibulatkan = (int) akhir;

        // Menghitung selisih antara nilai akhir dan nilai yang sudah dibulatkan.
        double selisih = akhir - dibulatkan;

