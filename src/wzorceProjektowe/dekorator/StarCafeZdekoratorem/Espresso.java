package wzorceProjektowe.dekorator.StarCafeZdekoratorem;

/**
 * Created by kkramarz on 05.10.16.
 */
public class Espresso extends Napoj {
    public Espresso() {
        opis = "Espresso";
    }


    public double koszt() {
        if(wielkoscKawy==1){
            return 1.45;
        }
        return 1.90;
    }
}
