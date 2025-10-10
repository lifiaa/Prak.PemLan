package Modul1;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nilai;
    String status;
    char grade;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
        this.status = cekKelulusan(nilai);
        this.grade = tentukanGrade(nilai);
    }

    private String cekKelulusan(int nilai) {
        return nilai >= 60 ? "Lulus" : "Tidak Lulus";
    }

    private char tentukanGrade(int nilai) {
        if (nilai >= 85) return 'A';
        else if (nilai >= 70) return 'B';
        else if (nilai >= 60) return 'C';
        else if (nilai >= 50) return 'D';
        else return 'E';
    }

    @Override
    public String toString() {
        return "Nama: " + nama + " | Nilai: " + nilai + " | Status: " + status + " | Grade: " + grade;
    }
}

public class ImproveT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            String nama = input.nextLine();

            int nilai;
            do {
                System.out.print("Masukkan nilai ujian akhir (0-100): ");
                nilai = input.nextInt();
                input.nextLine();
            } while (nilai < 0 || nilai > 100);

            daftarMahasiswa.add(new Mahasiswa(nama, nilai));
        }

        System.out.println("\n=== Hasil Kelulusan Mahasiswa ===");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }

        input.close();
    }
}
