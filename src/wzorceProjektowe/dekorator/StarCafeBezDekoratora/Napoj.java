package wzorceProjektowe.dekorator.StarCafeBezDekoratora;

/**
 * Created by kkramarz on 31.08.16.
 */
public abstract class Napoj {
    protected String opis;
    protected double cena;
    protected Boolean mleko = false;
    protected Boolean cukier= false;
    protected Boolean bitaSmietana= false;
    protected Boolean mleczkoSojowe= false;


     protected double koszt(){
         double suma = 0;
                 if(getMleko())suma+=0.30;
                 if(getBitaSmietana())suma+=0.45;
                 if(getCukier())suma+=0.10;
                 if(getMleczkoSojowe())suma+=0.10;
         return  suma;
     }

    public String pobierzOpis() {
        return opis;
    }


    public Boolean getMleko() {
        return mleko;
    }

    public void setMleko(Boolean mleko) {
        this.mleko = mleko;
    }

    public Boolean getCukier() {
        return cukier;
    }

    public void setCukier(Boolean cukier) {
        this.cukier = cukier;
    }

    public Boolean getBitaSmietana() {
        return bitaSmietana;
    }

    public void setBitaSmietana(Boolean bitaSmietana) {
        this.bitaSmietana = bitaSmietana;
    }

    public Boolean getMleczkoSojowe() {
        return mleczkoSojowe;
    }

    public void setMleczkoSojowe(Boolean mleczkoSojowe) {
        this.mleczkoSojowe = mleczkoSojowe;
    }
}
