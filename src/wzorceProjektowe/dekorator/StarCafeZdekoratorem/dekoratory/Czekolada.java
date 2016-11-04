package wzorceProjektowe.dekorator.StarCafeZdekoratorem.dekoratory;


import wzorceProjektowe.dekorator.StarCafeZdekoratorem.Napoj;

/**
 * Created by kkramarz on 04.10.16.
 */
public class Czekolada extends SkladnikDekorator {

    private Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;

    }

    @Override
    public double koszt() {
        if(wielkoscKawy==1){
            return napoj.koszt() + 0.10;
        }

        return napoj.koszt() + 0.20;
    }


    public String pobierzOpis() {

        return napoj.pobierzOpis() + " z czekoladą";
    }
}
