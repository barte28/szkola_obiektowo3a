public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    //konstruktor to metoda wywoływana w momencie tworzenia obiektu

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //przypisz do własności klasy imie (this wskazuje na ten obiekt
        //imie które jest parametrem tej metody
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}
