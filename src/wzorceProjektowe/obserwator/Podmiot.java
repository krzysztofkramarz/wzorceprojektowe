package wzorceProjektowe.obserwator;

/**
 * Created by kkramarz on 22.08.16.
 */
public interface Podmiot {
    void zarejestrujObserwatora(Obserwator o);
    void usunObserwatora(Obserwator o);
    void powiadomObserwatorow();
}
