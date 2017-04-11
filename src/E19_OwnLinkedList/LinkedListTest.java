package E19_OwnLinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		OwnLinkedList lista = new OwnLinkedList();
	
		lista.add("Strength");
		lista.add("Bent");
		lista.add("Equals");
		lista.add("Well");
		lista.add("Storm");
		
		
		System.out.println("Buscando: Well "+ lista.find("Well"));
		System.out.println("Buscando: Strenght "+ lista.find("Strength"));

		System.out.println("Buscando: 0 "+ lista.find("0"));
		
		System.out.println("Lista: "+ lista.toString());
		
		
	}

}
