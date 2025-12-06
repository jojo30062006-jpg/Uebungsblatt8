package h1;

public class Bruch {
	
	//Objektattribute
	int zaehler;
	int nenner;
	
	//Konstruktor
	public Bruch (int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	private int ggT (int x, int y) {
		
		// positiv
		x = Math.abs(x);
		y = Math.abs(y);
		
		// a größer als b
		if (x<y) {
			int tempX = x;
			x = y;
			y = tempX;
		}
		
		// größten gemeinsamen Teiler finden
		int r;
		do {
			r = x % y;
			x = y;
			y = r;
		} while (r>0);
	
		return x;
	}
	
	public void shorten () {
		
		int tempZaehler = zaehler;
		
		zaehler = zaehler / ggT(zaehler,nenner); 
		nenner = nenner / ggT(tempZaehler,nenner); 
		
		System.out.println (zaehler +"/" + nenner);
	}
	
	
	public boolean hasSameValueAs (Bruch b) {
		b.shorten();
		
		if(b.zaehler == zaehler  && b.nenner == nenner) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}
	
	

}
