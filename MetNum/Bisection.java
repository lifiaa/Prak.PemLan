package MetNum;

public class Bisection {
    public static void main(String[] args) {
        // Tentukan interval awal [a, b]
        double a = 1, b = 2, c = 0;

        // Jumlah iterasi (berapa kali perhitungan)
        int n = 5;

        // Perulangan sebanyak n kali
        for (int i = 1; i <= n; i++) {
            // Cari titik tengah
            c = (a + b) / 2;

            // Hitung nilai fungsi f(c) = c^3 - c - 2
            double fc = c*c*c - c - 2;

            // Cetak hasil iterasi ke layar
            System.out.printf("Iterasi %d : c = %.6f, F(c) = %.6f\n", i, c, fc);

            // Hitung f(a) untuk cek tanda
            double fa = a*a*a - a - 2;

            // Jika f(a)*f(c) < 0 → akar ada di kiri → interval baru [a, c]
            if (fa * fc < 0) {
                b = c;
            } else {
                // Jika tidak, berarti akar ada di kanan → interval baru [c, b]
                a = c;
            }
        }

        // Setelah selesai iterasi, cetak akar hampiran
        System.out.printf("\nAkar hampiran = %.6f\n", c);
    }
}
