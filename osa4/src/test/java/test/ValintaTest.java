package test;

import org.junit.jupiter.api.Test;
import kivipaperisakset.Valinta;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Yksikkötestiluokka Valinta-luokalle, joka tarjoaa metodin pelin valinnan (kivi, paperi, sakset) arpomiseen.
 * Tämä testiluokka varmistaa, että arpojan toiminta on odotusten mukainen ja että se tuottaa vain sallittuja arvoja.
 */
public class ValintaTest {

    /**
     * Testaa, että arvoValinta()-metodi palauttaa vain sallittuja arvoja ("kivi", "paperi", "sakset").
     * Suoritetaan satunnaisarvonta useita kertoja varmistaen, että jokainen tulos kuuluu sallittujen arvojen joukkoon.
     */
    @Test
    void testArvoValintaPalauttaaOikeatArvot() {
        Set<String> validitValinnat = new HashSet<>();
        validitValinnat.add("kivi");
        validitValinnat.add("paperi");
        validitValinnat.add("sakset");

        for (int i = 0; i < 100; i++) {
            String tulos = Valinta.arvoValinta();
            assertTrue(validitValinnat.contains(tulos), "arvoValinta() palautti virheellisen arvon: " + tulos);
        }
    }

    /**
     * Testaa, että arvoValinta()-metodi on satunnainen ja tuottaa kaikki mahdolliset vaihtoehdot riittävän suuren toistomäärän aikana.
     * Tarkistetaan, että 100 arvonnan aikana saadaan kaikki kolme mahdollista valintaa vähintään kerran.
     */
    @Test
    void testArvoValintaOnSatunnainen() {
        Set<String> arvotutValinnat = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            arvotutValinnat.add(Valinta.arvoValinta());
        }
        assertTrue(arvotutValinnat.size() == 3, "arvoValinta() i ole riittävän satunnainen, sillä emme saaneet kaikkia vaihtoehtoja");
    }
}
