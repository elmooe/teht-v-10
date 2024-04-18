package kivipaperisakset;

/**
 * Luokka tarjoaa staattisen metodin kivi-paperi-sakset -pelin valinnan arpomiseen.
 * Tämä luokka auttaa generoimaan satunnaisen valinnan pelissä käytettäväksi.
 */
public class Valinta {

    /**
     * Arpoo ja palauttaa satunnaisen valinnan peliin kivi-paperi-sakset.
     * Valinnat ovat kivi, paperi ja sakset, jotka on tallennettu taulukkoon.
     * Metodi valitsee yhden näistä valinnoista satunnaisesti.
     *
     * @return Merkkijonona arvottu valinta: joko "kivi", "paperi" tai "sakset".
     */
    public static String arvoValinta() {
        String[] valinnat = {"kivi", "paperi", "sakset"};
        int valinta = (int) (Math.random() * 3);
        return valinnat[valinta];
    }
}
