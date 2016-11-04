package wzorceProjektowe.fabryka.fabryka_I;

import wzorceProjektowe.fabryka.fabryka_I.GatunkiPizzy.Pizza;
import wzorceProjektowe.fabryka.fabryka_I.fabryki.ProstaFabrykaPizzy;

/**
 * Created by kkramarz on 06.10.16.
 */
public class Pizzeria {

    ProstaFabrykaPizzy prostaFabrykaPizzy;

    public Pizzeria(ProstaFabrykaPizzy prostaFabrykaPizzy){
        this.prostaFabrykaPizzy = prostaFabrykaPizzy;
    }

public Pizza zamowPizze(String type){
  Pizza pizza;
    pizza = prostaFabrykaPizzy.UtworzPizze(type);
    pizza.przygotowanie();
    pizza.pieczenie();
    pizza.krojenie();
    pizza.pakowanie();


    return pizza;

}
}
