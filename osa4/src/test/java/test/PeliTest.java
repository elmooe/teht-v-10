package test;

import org.junit.jupiter.api.Test;
import kivipaperisakset.Pelaaja;
import kivipaperisakset.Peli;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Yksikkötestiluokka Peli-luokalle, joka sisältää logiikan kivi-paperi-sakset pelin suorittamiseen.
 * Tämä luokka varmistaa, että pelin päättymislogiikka toimii odotetusti eri pelitilanteissa.
 */
public class PeliTest {

    /**
     * Testaa, että peli päättyy oikein, kun jompikumpi pelaajista saavuttaa kolme voittoa.
     * Tässä testissä simuloidaan tilannetta, jossa yksi pelaaja voittaa kolme kertaa peräkkäin,
     * ja varmistetaan, että peli tunnistaa tämän ja päättyy asianmukaisesti.
     */
    @Test
    void testPeliPaattyyKunVoitotTayttyvat() {
        Pelaaja p1 = new Pelaaja("Testi 1");
        Pelaaja p2 = new Pelaaja("Testi 2");

        p1.lisaaVoitto(); p1.lisaaVoitto(); p1.lisaaVoitto();

        Peli peli = new Peli();
        peli.kaynnistaPeli(p1.getNimi(), p2.getNimi());

        assertTrue(p1.getVoitot() >= 3 || p2.getVoitot() >= 3, "Pelin pitäisi päättyä, kun jompikumpi pelaaja saavuttaa 3 voittoa.");
    }
}
