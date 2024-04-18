package test;

import org.junit.jupiter.api.Test;
import kivipaperisakset.Pelaaja;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testiluokka, joka sisältää yksikkötestejä Pelaaja-luokalle.
 * Luokka testaa Pelaaja-luokan perustoiminnallisuuksia, kuten voittojen lisäämistä ja valinnan arpomista.
 */
public class PelaajaTest {

    /**
     * Testaa, että lisaaVoitto()-metodi lisää oikein yhden voiton pelaajan voittojen kokonaismäärään.
     * Alustetaan pelaaja nollavoitoilla, lisätään yksi voitto ja varmistetaan, että voittojen määrä on yksi.
     */
    @Test
    void testLisaaVoitto() {
        Pelaaja pelaaja = new Pelaaja("Testi");
        pelaaja.lisaaVoitto();
        assertEquals(1, pelaaja.getVoitot());
    }

    /**
     * Testaa, että arvoValinta()-metodi palauttaa jonkin kolmesta vaihtoehdosta: kivi, paperi tai sakset.
     * Tarkistetaan, että metodi ei palauta null-arvoa ja että palautettu arvo on yksi määritellyistä vaihtoehdoista.
     */
    @Test
    void testArvoValinta() {
        Pelaaja pelaaja = new Pelaaja("Testi");
        assertNotNull(pelaaja.arvoValinta());
        assertTrue(pelaaja.arvoValinta().matches("kivi|paperi|sakset"));
    }
}
