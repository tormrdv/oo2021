public class Kodu1 {

    public static void main(String[] arg) {

        Kodu rand = new Kodu();
        Kodu defense = new Kodu();
        Kodu loogid = new Kodu();

        //argumenti lisad l88gij5u, programm tagastab kas tugevusest piisab, et luua vastane knockouti voi ei

        System.out.println(rand.random());
        System.out.println(defense.def());
        float k = (Integer.parseInt(arg[0]));
        k = (loogid.loogimoju(k));
        String ko = "";
        if (k == 0) {
            ko = "KnockOut!!";
        } else {
            ko = "vaja laheks " + k + " sama tugevusega looki";
        }

        System.out.println(ko);

    }
}

