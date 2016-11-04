package wzorceProjektowe.dekorator.StarCafeZdekoratorem.dekoratory;

import wzorceProjektowe.dekorator.StarCafeZdekoratorem.Napoj;

/**
 * Created by kkramarz on 05.10.16.
 */
public abstract class SkladnikDekorator extends Napoj {

    @Override
    public abstract double koszt() ;

    @Override
    public abstract String pobierzOpis();

    ;
}
