import java.util.*;

public class Kodu {
    //String m = random();

    public static float loogimoju(float look) {
        //Kysin integeri Kodu1 classist
        int m = Kodu1.defense;
        String pauk = "";
        switch (m) {
            case 5 -> look = 1;
            case 4 -> look = 10;
            case 3 -> look = look - 60;
            case 2 -> look = look - 50;
            case 1 -> look = 111;
        }


        if (look >= 110) {
            pauk = "KO";
        }
        if (pauk.equals("KO")) {
            return 0;
        } else {
            return 110 / look;
        }
    }

}