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
        // Menentukan status kelulusan menggunakan boolean tanpa if.
        boolean lulus = akhir >= 60;

        // Menampilkan seluruh hasil perhitungan.
        System.out.println();
        System.out.println("===== NILAI AKHIR =====");
        System.out.println("Praktikum : " + praktikum + "  (30%)");
        System.out.println("Tugas     : " + tugas + "  (20%)");
        System.out.println("MID       : " + mid + "  (20%)");
        System.out.println("Final     : " + finalNilai + "  (30%)");

        System.out.println();
        System.out.println("Nilai akhir  : " + akhir);
        System.out.println("Dibulatkan   : " + dibulatkan);
        System.out.println("Selisih      : " + selisih);
        System.out.println("Lulus (>=60) : " + lulus);

        scanner.close();
    }
}

