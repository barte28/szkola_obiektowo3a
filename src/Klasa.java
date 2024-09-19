import java.util.ArrayList;

public class Klasa {
    private String nazwaKlasa;
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(String nazwaKlasa) {
        this.nazwaKlasa = nazwaKlasa;
        uczniowie = new ArrayList<>();
    }

    public Klasa(String nazwaKlasa, Nauczyciel wychowawca) {
        this.nazwaKlasa = nazwaKlasa;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }

    public void dodajUczniaDoKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            System.out.println(uczen+"jest już w tej klasie");
        }
        else {
            uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwaKlasa='" + nazwaKlasa + '\'' +
                ", wychowawca=" + wychowawca +
                ", uczniowie=" + uczniowie +

                '}';
    }
}
