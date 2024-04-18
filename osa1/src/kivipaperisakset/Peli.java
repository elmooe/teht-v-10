package kivipaperisakset;

public class Peli {
    public static void main(String args[]) {
        Pelaaja p1 = new Pelaaja("Pelaaja 1");
        Pelaaja p2 = new Pelaaja("Pelaaja 2");
        boolean peliLoppui = false;
        int pelatutPelit = 0;
        int tasapelit = 0;

        while (!peliLoppui) {
            System.out.println("Erä " + (pelatutPelit + 1) + " =====================");
            String p1Valinta = p1.pelaajanValinta();
            String p2Valinta = p2.pelaajanValinta();

            System.out.println(p1.getNimi() + ": " + p1Valinta + " (" + p1.getVoitot() + " voittoa)");
            System.out.println(p2.getNimi() + ": " + p2Valinta + " (" + p2.getVoitot() + " voittoa)");

            int tulos = tarkistaVoittaja(p1Valinta, p2Valinta);
            if (tulos == 0) {
                tasapelit++;
                System.out.println("Tasapeli!");
            } else if (tulos == 1) {
                p1.kasvataVoittoja();
                System.out.println(p1.getNimi() + " voittaa!");
            } else {
                p2.kasvataVoittoja();
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

    private static int tarkistaVoittaja(String p1Valinta, String p2Valinta) {
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
