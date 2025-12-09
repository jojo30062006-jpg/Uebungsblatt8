package h2;

public class SimpleList {
	
	//Objektattribut
	Node head = new Node (Integer.MIN_VALUE);
	
	//Konstruktor
	public SimpleList (Node head) {
		head = new Node (Integer.MIN_VALUE);
	}
	
	public Node getFirst() {
		//Liste ist leer
		if (head.next == null) {
			return null;
		}
		//erster echter Knoten
		return head.next;
	}
	
	public Node getLast() {
		//Liste ist leer
		if (head.next == null) {
			return null;
		}
		Node temp = head.next;
		
		while (temp.next != null) {
			temp = temp.next;
		}
		//temp ist jetzt der letze Knoten
		return temp;
	}
	
	public void append (int newValue) {
		
		Node Ende = new Node (newValue);
		
		//Liste lee?
		if (head.next == null) {
			head.next = Ende;
			return;
		}
		//letzten Knoten finden 
		Node letzten = head.next;
		while (letzten.next != null) {
			letzten = letzten.next;
		}
		
		letzten.next = Ende;
	}
	
	public Node findFirst (int value) {
		
		// beim ersten Knoten starten
		Node Vergleich = head.next;
		
		//solange laufen bis Vergleichen gleich value ist
		while (Vergleich != null) {
			if (Vergleich.value == value) {
				return Vergleich;
			}
			//weitergehen
			Vergleich = Vergleich.next;
		}
		//keinen Wert gefunden
		return null;
	}
	
	public boolean insertAfter (int preValue, int newValue) {
		
		Node Finden = findFirst(preValue);
		
		if (Finden == null) {
			return  false;
		}
		else {
			Node neu = new Node (newValue);
			
			neu.next = Finden.next;
			Finden.next = neu;
			
			return true;
		}	
	}
	
	public boolean delete (int value) {

	    Node vorher = head;       
	    Node current = head.next; 

	    while (current != null) {

	        if (current.value == value) {
	            vorher.next = current.next;
	            return true; 
	        }
	        vorher = current;
	        current = current.next;
	    }

	    return false;
	}	
	
}
