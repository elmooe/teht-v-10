package kivipaperisakset;

public class Peli {
    public void kaynnistaPeli(String nimi1, String nimi2) {
        Pelaaja p1 = new Pelaaja(nimi1);
        Pelaaja p2 = new Pelaaja(nimi2);
        pelaa(p1, p2);
    }

    private void pelaa(Pelaaja p1, Pelaaja p2) {
        boolean peliLoppui = false;
        int pelatutPelit = 0;
        int tasapelit = 0;

        while (!peliLoppui) {
            System.out.println("Erä " + (pelatutPelit + 1) + " =====================");
            System.out.println(p1.getNimi() + ": " + p1.arvoValinta() + " (" + p1.getVoitot() + " voittoa)");
            System.out.println(p2.getNimi() + ": " + p2.arvoValinta() + " (" + p2.getVoitot() + " voittoa)");

            int tulos = PeliLogiikka.tarkistaVoittaja(p1.arvoValinta(), p2.arvoValinta());

            if (tulos == 0) {
                tasapelit++;
            } else if (tulos == 1) {
                p1.lisaaVoitto();
                System.out.println("\n" + p1.getNimi() + " voittaa!");

            } else {
                p2.lisaaVoitto();
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
}
