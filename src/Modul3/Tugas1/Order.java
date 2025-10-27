package Modul3.Tugas1;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();

    private static final double TAX_RATE = 0.1; // 10%

    public void addItem(MenuItem item, int quantity) {
        items.add(item);
        quantities.add(quantity);
    }


    // Live Template
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }
        total += total * TAX_RATE;
        return total;
    }

    public void printReceipt() {
        System.out.println("\n===== JAVA DELIGHT RESTO =====");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + " x" + quantities.get(i)
                    + " = Rp" + (items.get(i).getPrice() * quantities.get(i)));
        }
        System.out.println("------------------------------");
//        System.out.println("Total (incl. tax): Rp" + calculateTotal());
        System.out.println("Terima kasih telah memesan!");
        System.out.println();
        System.out.println("Order.printReceipt");
    }

}
