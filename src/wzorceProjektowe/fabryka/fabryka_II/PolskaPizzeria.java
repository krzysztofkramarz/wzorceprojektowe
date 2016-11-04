package wzorceProjektowe.fabryka.fabryka_II;

import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.Pizza;
import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.polskie.OwoceMorza;
import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.polskie.Serowa;
import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.polskie.Wegetarianska;

/**
 * Created by kkramarz on 07.10.16.
 */
public class PolskaPizzeria extends Pizzeria {


    public Pizza utworzPizze(String type) {
        Pizza pizza = null;
        if (type == "owoceMorza") {
            pizza = new OwoceMorza();
        }
        if (type == "serowa") {
            pizza = new Serowa();
        }
        if (type == "wegetarianska") {
            pizza = new Wegetarianska();
        }
        return pizza;
    }
}
