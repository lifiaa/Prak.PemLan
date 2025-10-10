package Modul1;

import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class codelab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan usia Anda: ");
            int usia = sc.nextInt();
            periksaUsia(usia);
            System.out.println("Usia valid: " + usia);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void periksaUsia(int usia) throws InvalidAgeException {
        if (usia <= 0 || usia >= 120) {
            throw new InvalidAgeException("Usia tidak valid! Harus > 0 dan < 120.");
        }
    }
}
