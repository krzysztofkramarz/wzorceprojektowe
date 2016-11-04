package wzorceProjektowe.dekorator.StarCafeZdekoratorem;

/**
 * Created by kkramarz on 05.10.16.
 */
public abstract class  Napoj {
    public int wielkoscKawy;
    public String opis = "Napoj nieznany";

    public String pobierzOpis(){
        return  opis;
    }

    public int getWielkoscKawy() {
        return wielkoscKawy;
    }

    public void setWielkoscKawy(int wielkoscKawy) {
        this.wielkoscKawy = wielkoscKawy;
    }

    public    abstract double koszt();
}
