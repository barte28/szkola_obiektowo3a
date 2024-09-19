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
    }
}