public class Funktsioonid1{
	public static double taksosoit(int k) {
		int summa = 0;
		return k*0.8+3;
	}
	public static String temperatuuriHinnang(int t) {
		if(t<18) {return "kylm";}
		return "soe";
	}
	public static double ringiPindala(double r) {
		return Math.PI*r*r;
	}
	public static void main(String[] arg) {
		System.out.println(ringiPindala(5));
		if(arg.length==2) {
			System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
		}
		if(arg.length==2) {
			System.out.println(taksosoit(Integer.parseInt(arg[1])));
		}
	}
}