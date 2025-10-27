package Modul3.Codelab;
import java.util.Scanner;

/**
 * GameReflection.java
 * Program sederhana untuk menampilkan kesimpulan singkat tentang Game Studies
 * versi mahasiswa semester 3 yang belum paham game.
 *
 * Cara pakai:
 * javac GameReflection.java
 * java GameReflection
 */

public class GameReflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = sc.nextLine().trim();

        System.out.print("Masukkan semester (angka): ");
        String semester = sc.nextLine().trim();

        System.out.println("\n--- Hasil Refleksi ---\n");

        // Jika user menyebut semester 3, gunakan gaya bahasa yang diminta.
        if (semester.equals("3") || semester.equalsIgnoreCase("tiga")) {
            System.out.println("Nama: " + (name.isEmpty() ? "Mahasiswa" : name));
            System.out.println("Semester: " + semester + "\n");

            System.out.println("Kesimpulan singkat (versi mahasiswa semester 3):");
            System.out.println("Game Studies itu bidang yang mempelajari game dari berbagai sisi —");
            System.out.println("bukan cuma buat main, tapi juga soal bagaimana game dibuat, pengaruhnya");
            System.out.println("ke pemain, dan hubungannya dengan budaya serta teknologi.");
            System.out.println();
            System.out.println("Refleksi pribadi:");
            System.out.println("Awalnya saya kira game cuma hiburan. Setelah belajar sedikit, ternyata");
            System.out.println("ada banyak hal di balik game: ada unsur teknologi, seni, bahkan");
            System.out.println("psikologi. Saya masih belum paham banyak, tapi sekarang saya ngerti");
            System.out.println("bahwa game juga bisa dipelajari secara serius.");
        } else {
            // Versi umum kalau bukan semester 3
            System.out.println("Nama: " + (name.isEmpty() ? "Mahasiswa" : name));
            System.out.println("Semester: " + (semester.isEmpty() ? "-" : semester) + "\n");

            System.out.println("Kesimpulan singkat:");
            System.out.println("Game Studies adalah bidang yang mempelajari berbagai aspek game —");
            System.out.println("dari pembuatan, cara bermain, sampai dampaknya pada pemain dan masyarakat.");
            System.out.println();
            System.out.println("Refleksi singkat:");
            System.out.println("Game bukan sekadar hiburan; ia juga berkaitan dengan teknologi, seni,");
            System.out.println("dan perilaku manusia sehingga layak dipelajari.");
        }

        System.out.println("\n--- Selesai ---");
        sc.close();
    }
}
