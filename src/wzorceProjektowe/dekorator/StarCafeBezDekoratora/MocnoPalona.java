package wzorceProjektowe.dekorator.StarCafeBezDekoratora;

/**
 * Created by kkramarz on 09.09.16.
 */
public class MocnoPalona extends Napoj{
    @Override
    protected double koszt() {
        return 0.85 + super.koszt();
    }
}
