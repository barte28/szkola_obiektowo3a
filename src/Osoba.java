import java.util.Scanner;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    //prywatne własności są dostępne tylko w TEJ klasie

    //konstruktor to metoda wywoływana w momencie tworzenia obiektu

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //przypisz do własności klasy imie (this wskazuje na ten obiekt
        //imie które jest parametrem tej metody
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //metody dostępowe
    //gettery i settery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //wpisywanie hasla z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj haslo do zmiany imienia");
        String haslo = scanner.next();
        //jezeli haslo qwe123 to zmien w przeciwnym wypadku komunikat
        if(haslo.equals("qwe123")) {
            this.imie = imie;
        }
        else{
            System.out.println("nie możesz mzienić imienia");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
