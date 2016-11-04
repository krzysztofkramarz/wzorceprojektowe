package wzorceProjektowe.strategia;

import wzorceProjektowe.strategia.ImplLatanie.NieLataBoGumowa;

/**
 * Created by kkramarz on 28.07.16.
 */
public class Main {
    public static void main(String[] args) {
    Kaczka kaczka = new DzikaKaczka();
        kaczka.wykonajLec();
        kaczka.setLatanieInterefejs(new NieLataBoGumowa());
        kaczka.wykonajLec();
DzikaKaczka d = (DzikaKaczka) kaczka;
        d.sese();

    }


}
