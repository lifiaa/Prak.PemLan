package MetNum;

public class RegulaFalsi {
    // Fungsi f(x) = x^2 - 9
    static double f(double x) {
        return (x * x) - 9;
    }

    public static void main(String[] args) {
        double a = 1, b = 4;   // Batas awal
        double fa, fb, fx, x;
        double error = 0.001;  // Batas error
        int N = 3;             // Maksimal iterasi

        System.out.println("Metode Regula Falsi untuk f(x) = x^2 - 9\n");
        for (int i = 1; i <= N; i++) {
            fa = f(a);
            fb = f(b);
            // Rumus Regula Falsi
            x = (fb * a - fa * b) / (fb - fa);
            fx = f(x);
            System.out.printf("Iterasi %d: x = %.4f, f(x) = %.4f%n", i, x, fx);
            // Cek apakah sudah cukup dekat dengan 0
            if (Math.abs(fx) < error) {
                System.out.printf("Akar ditemukan: x = %.4f%n", x);
                break;
            }
            // Update batas interval
            if (fa * fx < 0)
                b = x;
            else
                a = x;
        }
        System.out.println("Perkiraan akar terakhir: " + (a + b) / 2);
    }
}

