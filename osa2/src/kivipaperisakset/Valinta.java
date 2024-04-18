package kivipaperisakset;

public class Valinta {
    public static String arvoValinta() {
        String[] valinnat = {"kivi", "paperi", "sakset"};
        int valinta = (int) (Math.random() * 3);
        return valinnat[valinta];
    }
}
