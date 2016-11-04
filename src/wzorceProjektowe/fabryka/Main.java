package wzorceProjektowe.fabryka;

import wzorceProjektowe.fabryka.fabryka_I.fabryki.AmerykanskaFabrykaPizzy;
import wzorceProjektowe.fabryka.fabryka_I.Pizzeria;
import wzorceProjektowe.fabryka.fabryka_I.fabryki.PolskaFabrykaPizzy;
import wzorceProjektowe.fabryka.fabryka_I.fabryki.WloskaFabrykaPizzy;
import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.Pizza;
import wzorceProjektowe.fabryka.fabryka_II.WloskaPizzeria;

/**
 * Created by kkramarz on 06.10.16.
 */
public class Main {

 /*   >>>>>>>>>>>>>>>>>>>> FABRYKA 1  <<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria(new PolskaFabrykaPizzy());

        System.out.println(pizzeria.zamowPizze("Serowa").getOpis());
        Pizzeria pizzeria2 = new Pizzeria(new AmerykanskaFabrykaPizzy());

        System.out.println(pizzeria2.zamowPizze("Serowa").getOpis());
        Pizzeria pizzeria3 = new Pizzeria(new WloskaFabrykaPizzy());

        System.out.println(pizzeria3.zamowPizze("Serowa").getOpis());

     /*   >>>>>>>>>>>>>>>>>>>> FABRYKA 2  <<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        System.out.println("*************************");
    wzorceProjektowe.fabryka.fabryka_II.Pizzeria pizzeriaa = new WloskaPizzeria();
        Pizza pizza = pizzeriaa.zamowPizze("serowa");
        System.out.println(pizza.getOpis());

    }
}
