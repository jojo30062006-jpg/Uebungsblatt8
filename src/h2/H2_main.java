package h2;

public class H2_main {
	public static void printList(SimpleList list) {
		Node current = list.head.next;
		if (current == null) {
			System.out.println("Liste ist leer");
			return;
			}

		while (current != null) {
			System.out.print(current.value + " ");
			current = current.next;
			}
			System.out.println(); 
		}
	
	
	public static void main(String[] args) {
	
		SimpleList myList = new SimpleList (new Node (Integer.MIN_VALUE));
		
		myList.append(12);
		myList.append(45);
		myList.append(66);
		myList.append(12);
		myList.append(45);
		myList.append(60);
		
		//unveränderte Liste:
		System.out.println("Meine aktuelle Liste:  ");
		printList(myList);  
		
		//Liste mit insert After:
		myList.insertAfter(45,4);
		System.out.println("Meine Liste nach insert After:  ");
		printList(myList); 
		
		//Liste mit find First:
		Node found = myList.findFirst(45);
		if (found != null) {
		    System.out.println("Wert " + found.value + " gefunden");
		} else {
		    System.out.println("Wert 45 nicht gefunden");
		}

		//Liste mit delete:
		myList.delete(45);
		System.out.println("Meine Liste nach delete:  ");
		printList(myList);
	}

}        
