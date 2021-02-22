import java.util.Random;
//Genereerin suvalise vastuse loogile
public class Kaitse {
    public static String random() {
        Random rand = new Random();
        int upper = 6;
        int kaitse = rand.nextInt(upper);
        return switch (kaitse) {
            case 5 -> "Põikas kõrvale";
            case 4 -> "Kaitses ära";
            case 3 -> "Kaitses peaaegu täiesti ära";
            case 2 -> "Kaitses halvasti";
            case 1 -> "Kaitse ei õnnestunud";
            case 0 -> "Kaitse ei õnnestunud";
            default -> "";
        };
    }
}
