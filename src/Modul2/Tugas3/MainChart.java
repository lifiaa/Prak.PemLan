package Modul2.Tugas3;

public class MainChart {
    public static void main(String[] args) {
        Item kopi = new Item("Biji Kopi Arabica", 85000.0);
        Item teh = new Item("Daun Teh Premium", 45000.0);
        Item gula = new Item("Gula Pasir 1kg", 14000.0);

        keranjangBelanja keranjang = new keranjangBelanja();

        System.out.println("--- Proses Penambahan Item ---");
        keranjang.tambahItem(kopi, 2);
        keranjang.tambahItem(teh, 1);
        keranjang.tambahItem(gula, 3);
        keranjang.tambahItem(kopi, 1); // Memperbarui kuantitas (bkn duplikasi baris)

        keranjang.tampilkanRincianBelanja();
    }
}
