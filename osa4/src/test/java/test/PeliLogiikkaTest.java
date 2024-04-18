package test;

import org.junit.jupiter.api.Test;
import kivipaperisakset.PeliLogiikka;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Yksikkötestiluokka PeliLogiikka-luokalle, joka sisältää logiikan voittajan määritykselle
 * kivi-paperi-sakset pelissä. Tämä luokka varmistaa, että voittajan määritys toimii odotetusti
 * kaikissa mahdollisissa tilanteissa.
 */
public class PeliLogiikkaTest {

    /**
     * Testaa tarkistaVoittaja-metodin logiikkaa varmistamalla, että se palauttaa oikeat arvot
     * eri valintaparien perusteella. Testaa kaikki mahdolliset yksinkertaiset skenaariot:
     * tasapelin, ensimmäisen pelaajan voiton ja toisen pelaajan voiton.
     */
    @Test
    void testVertaaValintoja() {
        assertEquals(0, PeliLogiikka.tarkistaVoittaja("kivi", "kivi"));
        assertEquals(1, PeliLogiikka.tarkistaVoittaja("kivi", "sakset"));
        assertEquals(-1, PeliLogiikka.tarkistaVoittaja("kivi", "paperi"));
    }
}
