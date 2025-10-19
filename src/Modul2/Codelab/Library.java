package Modul2.Codelab;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private String location;

    public Library(Book book,  String location) {
        this.location = location;
        addBook(book);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryInfo(){
        System.out.println("Library Location: " + getLocation());
        System.out.println("Books in Library:");
        for (Book book : books){
            book.displayInfo();
            System.out.println("------------------------");
        }
    }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
