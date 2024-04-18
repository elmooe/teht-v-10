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
            pelaaKierros(p1, p2);
            pelatutPelit++;
            System.out.println("Tasapelien lukumäärä: " + tasapelit);

            if (p1.getVoitot() >= 3 || p2.getVoitot() >= 3) {
                peliLoppui = true;
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
                System.out.println(p1.getNimi() + ": " + p1.getVoitot() + " voittoa, " + p2.getNimi() + ": " + p2.getVoitot() + " voittoa");
            }
        }
    }

    private static void pelaaKierros(Pelaaja p1, Pelaaja p2) {
        String p1Valinta = p1.pelaajanValinta();
        String p2Valinta = p2.pelaajanValinta();
        System.out.println(p1.getNimi() + ": " + p1Valinta + " (" + p1.getVoitot() + " voittoa)");
        System.out.println(p2.getNimi() + ": " + p2Valinta + " (" + p2.getVoitot() + " voittoa)");

        int tulos = PeliLogiikka.tarkistaVoittaja(p1Valinta, p2Valinta);
        if (tulos == 0) {
            System.out.println("Tasapeli!");
        } else if (tulos == 1) {
            p1.kasvataVoittoja();
            System.out.println(p1.getNimi() + " voittaa!");
        } else {
            p2.kasvataVoittoja();
            System.out.println(p2.getNimi() + " voittaa!");
        }
    }
}
