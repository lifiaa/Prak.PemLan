package Modul2.tugas2bef;

public abstract class ticket {
    public String passangerName;
    public String startlocation;
    public String destination;
    public double price;

    public ticket(String passengerName, String startLocation, String destination, double price) {
        this.passangerName = passengerName;
        this.startlocation = startLocation;
        this.destination = destination;
        this.price = price;
    }

    public abstract void displayInfo();
}
