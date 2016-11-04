package wzorceProjektowe.dekorator.StarCafeZdekoratorem;

/**
 * Created by kkramarz on 05.10.16.
 */
public class StarCafeSpecial extends Napoj {
    public StarCafeSpecial() {
        opis = "Espresso";
    }



    public double koszt() {
        if(wielkoscKawy==1){
            return 0.75;
        }
        return 1.00;
    }
}