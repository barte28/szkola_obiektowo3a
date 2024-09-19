public class Szkola {
    /*
    Singleton dozwolony tylko jeden obiekt tej klasy
     */
    private String nazwa;
    private static Szkola szkola = new Szkola();

    private Szkola() {
        //prywatny konstruktor jest dostępny tylko w tej klasie
    }
    public static Szkola getSzkola(){
        return szkola;
    }
}
