package wzorceProjektowe.dekorator.StarCafeZdekoratorem.dekoratory;

import wzorceProjektowe.dekorator.StarCafeZdekoratorem.Napoj;

/**
 * Created by kkramarz on 06.10.16.
 */
public class BitaSmietana extends SkladnikDekorator {
   private Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.20;
    }

    @Override
    public String pobierzOpis() {
        return napoj.opis+ " z bitą śmietaną";
    }
}
