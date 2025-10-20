package Modul1;
import java.util.Scanner;

class InvalidNumException extends Exception {
    public InvalidNumException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class InvalidNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Masukkan angka : ");

            if(!input.hasNextInt()){
                throw new InvalidInputException("\nInput harus berupa angka!");
            }

            int angka = input.nextInt();
            periksaAngka(angka);
            System.out.println("\n>> Valid Number! <<\nAngka " + angka + " adalah positif.");
        } catch (InvalidNumException e) {
            System.out.println("\n>> Invalid Number! <<" + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("\n>> Invalid Input! <<" + e.getMessage());
        }
    }

    public static void periksaAngka(int angka) throws InvalidNumException {
        if (angka < 0) {
            throw new InvalidNumException("\nAngka (" + angka + ") adalah negatif.");
        }
    }
}
