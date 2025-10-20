package Modul2.tugas2bef;

public class mainApp {

    public static void main(String[] args) {
        taxiticket ticket = new taxiticket(new ticketInfo("Alice", "Downtown", "Airport", 50.0), 30.0, 60.0);

        ticket.detailedInfo();

        ticket.checkStatus();

        ticket.displayRoute();
        ticket.displayEstimationDuration();

        ticket.slowDown(20);
        ticket.speedUp(15);
    }
}
