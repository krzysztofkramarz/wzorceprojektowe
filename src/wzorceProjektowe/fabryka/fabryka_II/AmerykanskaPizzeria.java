package wzorceProjektowe.fabryka.fabryka_II;

import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.Pizza;
import wzorceProjektowe.fabryka.fabryka_II.GatunkiPizzy.amerykasnkei.Serowa;


/**
 * Created by kkramarz on 07.10.16.
 */
public class AmerykanskaPizzeria {

    public Pizza utworzPizze(String type) {
        Pizza pizza = null;

        if (type == "serowa") {
            pizza = new Serowa();
        }

        return pizza;
    }
}
