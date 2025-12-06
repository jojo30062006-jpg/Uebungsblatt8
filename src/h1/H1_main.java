package h1;

public class H1_main {
	public static void main(String[] args) { 
		
		Bruch objekt1 = new Bruch(10,4);
		Bruch b = new Bruch (15,6);
		
		objekt1.shorten();
		objekt1.hasSameValueAs(b);
	}
}
