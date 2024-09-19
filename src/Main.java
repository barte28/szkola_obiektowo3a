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
    }
}