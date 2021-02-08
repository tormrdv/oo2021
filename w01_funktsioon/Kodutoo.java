public class Kodutoo{
	public static float loogimoju(float look) {
		String pauk = "";
		if(look >= 110) {pauk = "KO";}
		if(pauk == "KO") {return 0;} else {return 100 / look;}
	}

	public static void main(String[] arg) {
		//argumenti lisad l88gij5u, programm tagastab kas tugevusest piisab, et luua vastane knockouti voi ei
		float k = (loogimoju(Integer.parseInt(arg[0])));
		String ko = "";
		if(k == 0) {ko = "KnockOut!!";} else {ko = "vaja laheks "+k+" sama tugevusega looki";}
		
		System.out.println(ko);
	}
}