package kivipaperisakset;

public class PeliLogiikka {
    public static int tarkistaVoittaja(String p1Valinta, String p2Valinta) {
        if (p1Valinta.equals(p2Valinta)) {
            return 0; // Tasapeli
        }
        if ((p1Valinta.equals("kivi") && p2Valinta.equals("sakset")) ||
                (p1Valinta.equals("sakset") && p2Valinta.equals("paperi")) ||
                (p1Valinta.equals("paperi") && p2Valinta.equals("kivi"))) {
            return 1; // Pelaaja 1 voittaa
        }
        return -1; // Pelaaja 2 voittaa
    }
}