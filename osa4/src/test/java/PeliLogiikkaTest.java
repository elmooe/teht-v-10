import org.junit.jupiter.api.Test;
import kivipaperisakset.PeliLogiikka;

import static org.junit.jupiter.api.Assertions.*;

class PeliLogiikkaTest {

    @Test
    void testVertaaValintoja() {
        assertEquals(0, PeliLogiikka.tarkistaVoittaja("kivi", "kivi"));
        assertEquals(1, PeliLogiikka.tarkistaVoittaja("kivi", "sakset"));
        assertEquals(-1, PeliLogiikka.tarkistaVoittaja("kivi", "paperi"));
    }
}
