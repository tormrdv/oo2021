import java.util.*;

public class Kodu {
    String m = random();

    public static float loogimoju(float look) {
        int m = def();
        String pauk = "";
        switch (m) {
            case 5:
                look = 0;
                break;
            case 4:
                look = 10;
                break;
            case 3:
                look = look - 50;
                break;
            case 2:
                look = look - 60;
                break;
            case 1:
                look = 111;
                break;
        }


        if (look >= 110) {
            pauk = "KO";
        }
        if (pauk == "KO") {
            return 0;
        } else {
            return 110 / look;
        }
    }

    public static String random() {
        Random rand = new Random();
        int upper = 5;
        int kaitse = rand.nextInt(upper);
        String skill = "";
        switch (kaitse) {
            case 5:
                skill = "Põikas kõrvale";
                break;
            case 4:
                skill = "Kaitses ära";
                break;
            case 3:
                skill = "Kaitses peaaegu täiesti ära";
                break;
            case 2:
                skill = "Kaitses halvasti";
                break;
            case 1:
                skill = "Kaitse ei õnnestunud";
                break;
            case 0:
                skill = "Kaitse ei õnnestunud";
                break;
        }
        return skill;
    }

    public static int def() {
        String m = random();
        int k = 0;
        if (m == "Põikas kõrvale") {
            k = 5;
        }
        if (m == "Kaitses ära") {
            k = 4;
        }
        if (m == "Kaitses peaaegu täiesti ära") {
            k = 3;
        }
        if (m == "Kaitses halvasti") {
            k = 2;
        }
        if (m == "Kaitse ei õnnestunud") {
            k = 1;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(random());
    }
}