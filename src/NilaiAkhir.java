import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Konstanta bobot dan input nilai
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
    }
