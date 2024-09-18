public sealed class Nauczyciel
        extends Osoba
        permits Wychowawca{
    //sealed  ograniczenie dziedziczenia
    //permits jaka klasa może dziedziczyć
    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        super(imie, nazwisko, wiek);
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                " imie "+getImie()+
                " przedmiot='" + przedmiot + '\'' +
                "} ";
    }
}
