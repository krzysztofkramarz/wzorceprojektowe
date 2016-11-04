package wzorceProjektowe.fabryka.fabryka_II;

import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.Pizza;

/**
 * Created by kkramarz on 06.10.16.
 */
public abstract class Pizzeria {


    public Pizza zamowPizze(String type) {
        Pizza pizza;

        pizza = utworzPizze(type);
        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();


        return pizza;

    }

    protected abstract Pizza utworzPizze(String type);
}
