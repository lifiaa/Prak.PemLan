package Modul2.Tugas3;

public class ItemKeranjang {
    // intrd class
    private Item item;
    private int kuantitas;

    public ItemKeranjang(Item item, int kuantitas) {
        this.item = item;
        this.kuantitas = kuantitas;
    }

    public Item getItem() {
        return item;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    // Method baru: Hitung Subtotal untuk item ini
    public double hitungSubtotal() {
        return item.getHarga() * kuantitas;
    }

    public void tambahKuantitas(int jumlah) {
        this.kuantitas += jumlah;
    }
}
