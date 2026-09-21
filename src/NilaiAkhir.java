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
    }
}
