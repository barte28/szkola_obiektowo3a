public class Main {
    public static void main(String[] args) {

        Osoba osobaJas = new Osoba("Jaś","Śliweczka",7);

        //niezgodne z regułą hermetyzacji
        System.out.println(osobaJas.imie);
        System.out.println(osobaJas.nazwisko);
        osobaJas.imie = "Janek";
        System.out.println(osobaJas.imie);
        //hermetyzacja
        //powinno być tak żeby program główny nie mógł zmieniać własności klas

    }
}