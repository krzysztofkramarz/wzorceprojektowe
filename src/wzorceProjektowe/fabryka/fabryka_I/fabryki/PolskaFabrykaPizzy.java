package wzorceProjektowe.fabryka.fabryka_I.fabryki;

import wzorceProjektowe.fabryka.fabryka_I.GatunkiPizzy.polskie.OwoceMorza;
import wzorceProjektowe.fabryka.fabryka_I.GatunkiPizzy.Pizza;
import wzorceProjektowe.fabryka.fabryka_I.GatunkiPizzy.polskie.Serowa;
import wzorceProjektowe.fabryka.fabryka_I.GatunkiPizzy.polskie.Wegetarianska;

/**
 * Created by kkramarz on 06.10.16.
 */
public class PolskaFabrykaPizzy implements ProstaFabrykaPizzy{

    public Pizza UtworzPizze(String type){
        Pizza pizza = null;
        if(type=="OwoceMorza"){
            pizza = new OwoceMorza();
        }
        if(type=="Serowa"){
            pizza = new Serowa();
        }
        if(type=="Wegetarianska"){
            pizza = new Wegetarianska();
        }
        return pizza;
    }
}
