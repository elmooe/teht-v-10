package kivipaperisakset;

public class Pelaaja {
    private String nimi;
    private int voitot;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.voitot = 0;
    }

    public String pelaajanValinta() {
        String[] valinnat = {"kivi", "paperi", "sakset"};
        int c = (int) (Math.random() * 3);
        return valinnat[c];
    }

    public void kasvataVoittoja() {
        this.voitot++;
    }

    public int getVoitot() {
        return this.voitot;
    }

    public String getNimi() {
        return this.nimi;
    }
}