package Modul2.Tugas3;

public class Item {
    private String nama;
    private double harga;

    public Item(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }
}
