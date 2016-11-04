package wzorceProjektowe.obserwator;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by kkramarz on 22.08.16.
 */
public class DanePogodowe extends Observable { //implements Podmiot
    ArrayList<Obserwator> obserwators;
    float temperatura;
    float wilgotnosc;
    float cisnienie;

    public DanePogodowe() {
        //obserwators = new ArrayList<>();

    }


    public void zarejestrujObserwatora(Obserwator o) {
        obserwators.add(o);

    }


    public void usunObserwatora(Obserwator o) {
        int i = obserwators.indexOf(o);
        if (i >= 0) {
            obserwators.remove(i);
        }
    }


    public void powiadomObserwatorow() {

        for (int i = 0; i < obserwators.size(); i++) {
            obserwators.get(i).aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }

    public void odczytyZmiana() {
        powiadomObserwatorow();
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        setChanged();
        //odczytyZmiana();
    }

}
