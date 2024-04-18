package kivipaperisakset;

/**
 * Tämä luokka tarjoaa toiminnot kivi-paperi-sakset -pelin pelaamiseen kahden pelaajan välillä.
 * Peli päättyy, kun jompikumpi pelaajista saavuttaa kolme voittoa.
 */
public class Peli {

    /**
     * Käynnistää kivi-paperi-sakset -pelin kahdelle pelaajalle, jotka annetaan nimien perusteella.
     * Luo kaksi Pelaaja-oliota nimillä ja käynnistää pelin.
     *
     * @param nimi1 Ensimmäisen pelaajan nimi.
     * @param nimi2 Toisen pelaajan nimi.
     */
    public void kaynnistaPeli(String nimi1, String nimi2) {
        Pelaaja p1 = new Pelaaja(nimi1);
        Pelaaja p2 = new Pelaaja(nimi2);
        pelaa(p1, p2);
    }

    /**
     * Yksityinen metodi, joka suorittaa itse pelin logiikan. Peliä pelataan kunnes toinen pelaajista
     * saavuttaa kolme voittoa. Pelin kulku tulostetaan konsoliin, mukaan lukien pelaajien nimet, valinnat,
     * voittojen määrät ja tasapelit.
     *
     * @param p1 Ensimmäinen pelaaja, joka osallistuu peliin.
     * @param p2 Toinen pelaaja, joka osallistuu peliin.
     */
    private void pelaa(Pelaaja p1, Pelaaja p2) {
        boolean peliLoppui = false;
        int pelatutPelit = 0;
        int tasapelit = 0;

        while (!peliLoppui) {
            System.out.println("Erä " + (pelatutPelit + 1) + " =====================");
            System.out.println(p1.getNimi() + ": " + p1.arvoValinta() + " (" + p1.getVoitot() + " voittoa)");
            System.out.println(p2.getNimi() + ": " + p2.arvoValinta() + " (" + p2.getVoitot() + " voittoa)");

            int tulos = PeliLogiikka.tarkistaVoittaja(p1.arvoValinta(), p2.arvoValinta());

            if (tulos == 0) {
                tasapelit++;
            } else if (tulos == 1) {
                p1.lisaaVoitto();
                System.out.println("\n" + p1.getNimi() + " voittaa!");

            } else {
                p2.lisaaVoitto();
                System.out.println(p2.getNimi() + " voittaa!");

            }

            pelatutPelit++;
            System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");

            if (p1.getVoitot() >= 3 || p2.getVoitot() >= 3) {
                peliLoppui = true;
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
                System.out.println(p1.getNimi() + ": " + p1.getVoitot() + " voittoa, " + p2.getNimi() + ": " + p2.getVoitot() + " voittoa");
            }
        }
    }
}
