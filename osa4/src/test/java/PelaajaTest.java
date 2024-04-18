import org.junit.jupiter.api.Test;
import kivipaperisakset.Pelaaja;

import static org.junit.jupiter.api.Assertions.*;

public class PelaajaTest {
    @Test
    void testLisaaVoitto() {
        Pelaaja pelaaja = new Pelaaja("Testi");
        pelaaja.lisaaVoitto();
        assertEquals(1, pelaaja.getVoitot());
    }

    @Test
    void testArvoValinta() {
        Pelaaja pelaaja = new Pelaaja("Testi");
        assertNotNull(pelaaja.arvoValinta());
        assertTrue(pelaaja.arvoValinta().matches("kivi|paperi|sakset"));
    }
}
