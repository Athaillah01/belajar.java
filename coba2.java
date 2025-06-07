import java.util.Scanner;

// Kelas Kalkulator
class Kalkulator {
    // Metode untuk penjumlahan
    public double tambah(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public double kurang(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    public double kali(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    public double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Tidak bisa dibagi dengan nol!");
            return 0;
        }
        return a / b;
    }
}

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkula
