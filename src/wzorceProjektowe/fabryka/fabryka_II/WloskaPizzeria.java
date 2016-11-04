package wzorceProjektowe.fabryka.fabryka_II;


import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.Pizza;
import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.wloskie.Serowa;

import java.util.Objects;

/**
 * Created by kkramarz on 07.10.16.
 */
public class WloskaPizzeria extends Pizzeria {

    public Pizza utworzPizze(String type) {
        Pizza pizza = null;


        if (Objects.equals(type, "serowa")) {
            pizza = new Serowa();
        }

        return pizza;
    }
}
