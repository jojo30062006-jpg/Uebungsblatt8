package h2;

public class Node {
	
	//Objektattribute
	Node next; //Zeiger auf den nächsten Knoten
	int value; // gespeicherter Wert
	
	// Konstruktor
	public Node (int value) {
		this.value = value;
		this.next = null;
	}

	
}
