package wzorceProjektowe.dekorator.StarCafeBezDekoratora;

/**
 * Created by kkramarz on 31.08.16.
 */
public class KawaZeSmietanka extends Napoj {

    public KawaZeSmietanka() {
        this.opis = "napoj ekstra";
    }

    @Override
    protected double koszt() {

          return super.koszt() + 1.20;
        }
}
