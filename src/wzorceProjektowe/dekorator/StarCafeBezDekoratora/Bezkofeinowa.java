package wzorceProjektowe.dekorator.StarCafeBezDekoratora;

/**
 * Created by kkramarz on 09.09.16.
 */
public class Bezkofeinowa extends Napoj{
    public Bezkofeinowa(){
       opis = "Super bezkoinowa kawka";
    }
    @Override
    protected double koszt() {
      //  BigDecimal a = new BigDecimal(super.koszt());
     //  return a + 2;
    return 1;}

}
