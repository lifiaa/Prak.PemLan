package Modul2.Tugas2;

public abstract class Ticket {
    public String passengerName;
    public String startlocation;
    public String destination;
    public double price;

    public Ticket(String passengerName, String startLocation, String destination, double price) {
        this.passengerName = passengerName;
        this.startlocation = startLocation;
        this.destination = destination;
        this.price = price;
    }

    public abstract void displayInfo();
}
