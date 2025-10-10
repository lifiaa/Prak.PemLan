package Modul1;
import java.util.Scanner;

public class nilaiUjian {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();

        System.out.println("Nilai Ujian Akhir : ");
        int nilaiMahasiswa = input.nextInt();

        String status;
        if (nilaiMahasiswa >= 60){
            status = "Lulus";
        } else {
            status = "Tidak Lulus.";
        }

        System.out.println("Nama : " + namaMahasiswa + "\nStatus : " + status);
        input.close();
    }
}

//formal
//Deskripsi formal biasanya menggunakan bahasa yang lebih teknis, jelas, dan terstruktur. Menjelaskan input, proses, dan output program.

//informal
//Program ini digunakan untuk membantu seorang guru menentukan apakah seorang mahasiswa lulus atau tidak. Guru hanya perlu memasukkan nama mahasiswa dan nilai ujian akhirnya. Setelah itu, program akan mengecek