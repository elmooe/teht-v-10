package kivipaperisakset;

/**
 * Luokka edustaa yksittäistä pelaajaa kivi-paperi-sakset -pelissä.
 * Pelaaja-olio sisältää tiedot pelaajan nimestä ja tämän saavuttamista voitoista.
 */
public class Pelaaja {
    private String nimi;
    private int voitot;

    /**
     * Luo uuden pelaajan annetulla nimellä.
     * Alustaa pelaajan voittojen määrän nollaan.
     *
     * @param nimi Pelaajan nimi.
     */
    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.voitot = 0;
    }

    /**
     * Arpoo ja palauttaa pelaajan valinnan pelissä.
     * Valinta voi olla joko 'kivi', 'paperi' tai 'sakset'.
     *
     * @return Palauttaa merkkijonona pelaajan valinnan.
     */
    public String arvoValinta() {
        return Valinta.arvoValinta();
    }

    /**
     * Kasvattaa pelaajan voittojen määrää yhdellä.
     */
    public void lisaaVoitto() {
        voitot++;
    }

    /**
     * Palauttaa pelaajan voittojen määrän.
     *
     * @return Pelaajan voittojen kokonaismäärä.
     */
    public int getVoitot() {
        return voitot;
    }

    /**
     * Palauttaa pelaajan nimen.
     *
     * @return Pelaajan nimi merkkijonona.
     */
    public String getNimi() {
        return nimi;
    }
}
