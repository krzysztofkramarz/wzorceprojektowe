package wzorceProjektowe.strategia;

import wzorceProjektowe.strategia.ImplLatanie.LatamBoMamSkrzydla;

/**
 * Created by kkramarz on 28.07.16.
 */
public class DzikaKaczka extends Kaczka {
    public DzikaKaczka() {
        latanieInterefejs = new LatamBoMamSkrzydla();

    }

   public  void sese(){
       System.out.println("sese");
   }


}
