package Modul2.Tugas3;
import java.util.ArrayList;
import java.util.List;

public class keranjangBelanja {
    // List<Item> chge sign
    private List<ItemKeranjang> itemsDiKeranjang;

    // extr cnst PAJAK_RATE
    private static final double PAJAK_RATE = 0.10;

    public keranjangBelanja() {
        this.itemsDiKeranjang = new ArrayList<>();
    }

    public void tambahItem(Item itemBaru, int kuantitas) {
        for (ItemKeranjang iK : itemsDiKeranjang) {
            if (iK.getItem().getNama().equalsIgnoreCase(itemBaru.getNama())) {
                iK.tambahKuantitas(kuantitas);
                System.out.println("Kuantitas '" + itemBaru.getNama() + "' diperbarui menjadi " + iK.getKuantitas());
                return;
            }
        }

        ItemKeranjang newItem = new ItemKeranjang(itemBaru, kuantitas);
        itemsDiKeranjang.add(newItem);
        System.out.println(itemBaru.getNama() + " (" + kuantitas + " unit) berhasil ditambahkan.");
    }

    // extr mthod (Subtotal)
    public double hitungSubtotal() {
        double subtotal = 0;
        for (ItemKeranjang iK : itemsDiKeranjang) {
            subtotal += iK.hitungSubtotal();
        }
        return subtotal;
    }

    // extr mthod (Pajak)
    public double hitungPajak() {
        return hitungSubtotal() * PAJAK_RATE;
    }

    public double hitungTotalAkhir() {
        return hitungSubtotal() + hitungPajak();
    }

    public double hitungTotalSetelahDiskon() {
        double total = hitungTotalAkhir();
        if (total > 100000) {
            total -= total * 0.05;
            System.out.println("Diskon 5% diterapkan untuk total di atas Rp100.000!");
        }
        return total;
    }


    // rename
    public void tampilkanRincianBelanja() {
        if (itemsDiKeranjang.isEmpty()) {
            System.out.println("Keranjang belanja kosong.");
            return;
        }

        System.out.println("\n==================================");
        System.out.println("      RINCIAN KERANJANG BELANJA     ");
        System.out.println("====================================\n");

        for (ItemKeranjang iK : itemsDiKeranjang) {
            Item item = iK.getItem();
            double subtotalItem = iK.hitungSubtotal();
            System.out.printf("%s (x%d) @ Rp %.2f = Rp %.2f\n",
                    item.getNama(), iK.getKuantitas(), item.getHarga(), subtotalItem);
        }

        double subtotal = hitungSubtotal();
        double pajak = hitungPajak();
        double totalAkhir = hitungTotalAkhir();

        System.out.println("----------------------------------");
        System.out.printf("Subtotal             : Rp %.2f\n", subtotal);
        System.out.printf("Pajak (%.0f%%)       : Rp %.2f\n", PAJAK_RATE * 100, pajak);
        System.out.println("==================================");
        System.out.printf("Total Akhir          : Rp %.2f\n", totalAkhir);
        System.out.println("==================================");
        double totalDiskon = hitungTotalSetelahDiskon();
        System.out.printf("Total Setelah Diskon:   Rp %.2f\n", totalDiskon);
        System.out.println("==================================");

    }
}