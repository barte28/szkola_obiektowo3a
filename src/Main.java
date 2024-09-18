public class Main {
    public static void main(String[] args) {

        Osoba osobaJas = new Osoba("Jaś","Śliweczka",10);
//wywołuję konstruktor klasy Osoba
        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");

        Osoba osobaAla = new Osoba("Ala", "Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());
        Osoba osobaX = new Osoba();

        System.out.println(osobaJas);
    }
}