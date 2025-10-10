package Modul2;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    Book(String title, String author, double price, int stock) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
        this.setStock(stock);
    }

    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Discounted price $" + (getPrice() - (getPrice() * 0.1)));
        System.out.println("Stock: " + getStock());
    }

    public void adjustStock(int adjusment){
        setStock(getStock() + adjusment);
        System.out.println("Stock adjusted.");
        System.out.println("Current stock: " + getStock());
    }

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getStock() {
        return stock;
    }

    protected void setStock(int stock) {
        this.stock = stock;
    }
}
