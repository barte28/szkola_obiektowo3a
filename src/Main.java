public class Main {
    public static void main(String[] args) {

        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen = new Uczen("Daniel","Nowy");
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Daniela","Nowa");
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Danielo","Stary");
        System.out.println(uczen3);
        System.out.println("Liczba Uczniow"+Uczen.liczbaObiektow);

        Nauczyciel nauczycielSlowik = new Nauczyciel("Marlena", "Slowik",25,"matematyka");
        System.out.println(nauczycielSlowik);


        Klasa klasa3a = new Klasa("3a_programisci",nauczycielSlowik);
        klasa3a.dodajUczniaDoKlasy(uczen);
        klasa3a.dodajUczniaDoKlasy(uczen2);
        klasa3a.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa3a);

        Szkola zs10 = Szkola.getSzkola();

    }
}
/*
import java.util.Scanner;

public class EuclidAlgorithm {

    // Function to calculate GCD using Euclid's algorithm
    public static int calculateGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;  // or return b, since a == b at the end
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: two integers a and b
        System.out.println("Enter two positive integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Check if the numbers are positive
        if (a <= 0 || b <= 0) {
            System.out.println("Both numbers must be positive integers.");
        } else {
            // Call the GCD function
            int gcd = calculateGCD(a, b);

            // Output the result
            System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
        }

        scanner.close();
    }
}
*/