package kivipaperisakset;

/**
 * Luokka sisältää logiikan kivi-paperi-sakset -pelin voittajan määrittämiseksi.
 * Tämä luokka tarjoaa staattisen metodin, joka vertaa kahta pelissä tehtyä valintaa ja määrittää niiden perusteella voittajan.
 */
public class PeliLogiikka {

    /**
     * Vertaa kahta annettua valintaa ja palauttaa tuloksen, joka määrittää pelin voittajan.
     * Valinnat ovat "kivi", "paperi" ja "sakset".
     *
     * @param p1Valinta Ensimmäisen pelaajan valinta.
     * @param p2Valinta Toisen pelaajan valinta.
     * @return Kokonaisluku, joka kertoo pelin tuloksen:
     *         0, jos peli päättyy tasapeliin,
     *         1, jos ensimmäinen pelaaja voittaa,
     *        -1, jos toinen pelaaja voittaa.
     */
    public static int tarkistaVoittaja(String p1Valinta, String p2Valinta) {
        if (p1Valinta.equals(p2Valinta)) {
            return 0; // Tasapeli
        }
        if ((p1Valinta.equals("kivi") && p2Valinta.equals("sakset")) ||
                (p1Valinta.equals("sakset") && p2Valinta.equals("paperi")) ||
                (p1Valinta.equals("paperi") && p2Valinta.equals("kivi"))) {
            return 1; // Pelaaja 1 voittaa
        }
        return -1; // Pelaaja 2 voittaa
    }
}