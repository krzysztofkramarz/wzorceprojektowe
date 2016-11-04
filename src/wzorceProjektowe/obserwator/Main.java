package wzorceProjektowe.obserwator;

/**
 * Created by kkramarz on 25.08.16.
 */
public class Main {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();
       // WarunkiBiezace wb = new WarunkiBiezace(danePogodowe);
        danePogodowe.ustawOdczyty(2.6f,4.3f,5.234f);
    }
}
