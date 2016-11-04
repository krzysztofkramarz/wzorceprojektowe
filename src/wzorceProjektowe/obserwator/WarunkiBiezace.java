package wzorceProjektowe.obserwator;

/**
 * Created by kkramarz on 22.08.16.
 */
public class WarunkiBiezace implements Obserwator {

    float temperatura;
    float wilgotnosc;
    float cisnienie;
    private Podmiot danePogodowe;


    public WarunkiBiezace(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        wyswietl();
    }

    private void wyswietl (){

        System.out.println("WarunkiBiezace " +
                "temperatura = " + temperatura +
                ", wilgotnosc = " + wilgotnosc +
                ", cisnienie = " + cisnienie );
    }


}
