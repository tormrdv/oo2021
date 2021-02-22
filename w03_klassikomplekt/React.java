public class React {
    public static int def() {
        //Vordlen stringi mille genereerib Kaitse class
        String m = Kaitse.random();
        int k = 0;
        if (m.equals("Põikas kõrvale")) {
            k = 5;
        }
        if (m.equals("Kaitses ära")) {
            k = 4;
        }
        if (m.equals("Kaitses peaaegu täiesti ära")) {
            k = 3;
        }
        if (m.equals("Kaitses halvasti")) {
            k = 2;
        }
        if (m.equals("Kaitse ei õnnestunud")) {
            k = 1;
        }
        System.out.println(m);
        return k;
    }
}
