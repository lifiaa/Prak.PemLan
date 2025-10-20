package Modul2.Tugas2;

public class TaxiTicket extends Ticket implements Operational {
    public static final double TAX_RATE = 0.1;
    private double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public TaxiTicket(TicketInfo ticketInfo, double duration, double speed) {
        super(ticketInfo.passengerName(), ticketInfo.startLocation(), ticketInfo.destination(), ticketInfo.price());
        this.duration = duration;
        this.speed = speed;
    }

    @Override
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    @Override
    public void displayRoute() {
        System.out.println("Route: " + startlocation + " -> " + destination);
    }

    public void slowDown(double speedReduction) {
        speed -= speedReduction;
        if (speed < MIN_SPEED) {
            speed = MIN_SPEED;
        }
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");
    }

    public void speedUp(double speedIncrease) {
        speed += speedIncrease;
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
        System.out.println("Taxi sped up! Current speed: " + speed + " km/h");
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Start Location : " + startlocation);
        System.out.println("Destination : " + destination);
        System.out.println("Price : " + price);
        System.out.println("Final Price : " + calculatePrice());
    }

    private double calculatePrice() {
        return price + (price * TAX_RATE);
    }

    public void detailedInfo() {
        displayInfo();
        System.out.println("Duration : " + duration + " minutes");
        System.out.println("Speed : " + speed + " km/h");
    }
}