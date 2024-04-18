import org.junit.jupiter.api.Test;
import kivipaperisakset.Valinta;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
public class ValintaTest {
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

    @Test
    void testArvoValintaOnSatunnainen() {
        Set<String> arvotutValinnat = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            arvotutValinnat.add(Valinta.arvoValinta());
        }
        assertTrue(arvotutValinnat.size() == 3, "arvoValinta() i ole riittävän satunnainen, sillä emme saaneet kaikkia vaihtoehtoja");
    }
}
