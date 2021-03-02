import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Kirjalik jagamine

public class KT1 {
    public static double jagamine(String[] sisend) throws IOException {
        double summa = 0;
        //double teine = Double.parseDouble(sisend[1]);
        for (int i = 0; i < sisend.length; i++) {
            if (sisend[0] == "0" || sisend[1] == "0") {
                summa = 0;
            } else {
                summa = Double.parseDouble(sisend[0]) / Double.parseDouble(sisend[1]);
            }
        }
        return summa;
    }

    public static double korrutamine(String[] sisend) {
        double summa = 0;
        for (int i = 0; i < sisend.length; i++) {
            summa = Double.parseDouble(sisend[0]) * Double.parseDouble(sisend[1]);
        }
        return summa;
    }

    public static double kirjalik(String[] sisend) {
        double summa = 0;
        double jaak = 0;
        for (int i = 0; i < sisend.length; i++) {
            summa = Double.parseDouble(sisend[0]) % Double.parseDouble(sisend[1]);
            //System.out.println(summa);
        }
        return summa;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader fail = new BufferedReader(
                new FileReader("arvud.txt")
        );
        String rida = fail.readLine();
        String first = (rida.split(" "))[0];
        String teine = (rida.split(" "))[1];
        double k = jagamine(rida.split(" "));
        if (k == 0) {
            throw new IOException("Nulliga ei saa jagada");
        }
        String esimene = (Double.toString(k).substring(0, 1));
        String[] teinetehe = {esimene, teine};

        double j2 = korrutamine(teinetehe);
        double k2 = kirjalik(rida.split(" "));

        System.out.println(rida);
        System.out.println(j2);
        System.out.println(k);
        System.out.println(esimene + " " + teine);


        fail.close();
    }
}
