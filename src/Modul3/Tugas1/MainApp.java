package Modul3.Tugas1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Order order = new Order();

        System.out.println("=== Aplikasi Nota Pemesanan Makanan ===");

        boolean lanjut = true;
        while (lanjut) {
            System.out.print("\nMasukkan nama makanan: ");
            String name = input.nextLine();

            System.out.print("Masukkan harga satuan: Rp");
            double price = input.nextDouble();

            System.out.print("Masukkan jumlah pesanan: ");
            int qty = input.nextInt();
            input.nextLine(); // clr buffer

            MenuItem item = new MenuItem(name, price);
            order.addItem(item, qty);

            System.out.print("Tambah pesanan lain? (y/n): ");
            String jawab = input.nextLine();
            lanjut = jawab.equalsIgnoreCase("y");
        }

        order.printReceipt();
        input.close();
    }
}
