package kivipaperisakset;

public class Pelaaja {
    private String nimi;
    private int voitot;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.voitot = 0;
    }

    public String pelaajanValinta() {
        return Valinta.arvoValinta();
    }

    public void kasvataVoittoja() {
        voitot++;
    }

    public int getVoitot() {
        return voitot;
    }

    public String getNimi() {
        return nimi;
    }
}
