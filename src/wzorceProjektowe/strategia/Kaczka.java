package wzorceProjektowe.strategia;



/**
 * Created by kkramarz on 28.07.16.
 */
public abstract class Kaczka  {
    LatanieInterefejs latanieInterefejs;
    KwakanieInterfejs kwakanieInterfejs;

    public void setLatanieInterefejs(LatanieInterefejs latanieInterefejs) {
        this.latanieInterefejs = latanieInterefejs;
    }

    public void setKwakanieInterfejs(KwakanieInterfejs kwakanieInterfejs) {
        this.kwakanieInterfejs = kwakanieInterfejs;
    }

    public void wykonajLec(){
        latanieInterefejs.lec();

    }
}
