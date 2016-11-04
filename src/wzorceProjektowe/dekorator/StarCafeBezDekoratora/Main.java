package wzorceProjektowe.dekorator.StarCafeBezDekoratora;

/**
 * Created by kkramarz on 31.08.16.
 */
public class Main {

    public static void main(String[] args) {

        Napoj napoj  = new KawaZeSmietanka();
        System.out.println(napoj.pobierzOpis());
        System.out.println(napoj.koszt());
napoj.setBitaSmietana(true);
        System.out.println(napoj.koszt());
Napoj mocnoPalona = new MocnoPalona();

    }

}
