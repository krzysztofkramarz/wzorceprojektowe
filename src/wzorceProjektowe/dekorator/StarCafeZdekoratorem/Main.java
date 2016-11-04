package wzorceProjektowe.dekorator.StarCafeZdekoratorem;

import wzorceProjektowe.dekorator.StarCafeZdekoratorem.dekoratory.BitaSmietana;
import wzorceProjektowe.dekorator.StarCafeZdekoratorem.dekoratory.Czekolada;

/**
 * Created by kkramarz on 06.10.16.
 */
public class Main {
    public static void main(String[] args) {
        Napoj esspresso = new Espresso();
        Napoj esspressoCzekolada = new Czekolada(new Czekolada(new BitaSmietana(new Espresso())));


        Napoj esspressoCzekolada2 = new Czekolada(new Czekolada(new BitaSmietana(new Espresso())));

        Napoj esspresso3 = new Espresso();
        esspresso3.setWielkoscKawy(1);
       esspresso3 = new BitaSmietana(esspresso3);
        esspresso3 = new Czekolada(esspresso3);
        esspresso3 = new Czekolada(esspresso3);
        System.out.println(esspresso.pobierzOpis() + " " + esspresso.koszt());
        System.out.println(esspressoCzekolada.pobierzOpis() + " " + esspressoCzekolada.koszt());
        System.out.println("esspresso2 = " + esspressoCzekolada.pobierzOpis() + " " + esspressoCzekolada.koszt());
        System.out.println("esspresso3 = " + esspresso3.pobierzOpis() + " " + esspresso3.koszt());



    }
}
