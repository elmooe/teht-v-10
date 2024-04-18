package kivipaperisakset;

/**
 * Pääluokka kivi-paperi-sakset -pelille.
 * Tämä luokka sisältää main-metodin, joka käynnistää pelin.
 * Käynnistää pelin luomalla Peli-olion ja antamalla pelaajien nimet.
 */
public class Main {

    /**
     * Päämetodi, joka käynnistää kivi-paperi-sakset -pelin.
     * Luo Peli-luokan ilmentymän ja käynnistää pelin kahdelle pelaajalle nimillä "Pelaaja 1" ja "Pelaaja 2".
     *
     * @param args Komentoriviparametrit, joita ei tässä sovelluksessa käytetä.
     */
    public static void main(String[] args) {
        Peli peli = new Peli();
        peli.kaynnistaPeli("Pelaaja 1", "Pelaaja 2");
    }
}
