package h1;

public class H1_main {
	public static void main(String[] args) { 
		
		Bruch objekt1 = new Bruch(100,102);
		Bruch b = new Bruch (8,27);
		
		objekt1.shorten();
		objekt1.hasSameValueAs(b);
	}
}
