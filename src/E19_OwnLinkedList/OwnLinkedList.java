package E19_OwnLinkedList;

public class OwnLinkedList {

	private Node head;
	int length;

	// Costructor por defecto

	public OwnLinkedList() {
	}

	public void add(Object value) {
		// si la lista esta vacia
		if (head == null) {
			head = new Node(value);
		}
		// guardo el valor actual del nodo y el proximo valor a ingresar
		Node headTemp = new Node(value);
		Node headCurr = head;

		// reviso que el nodo actual no sea vacio
		if (headCurr != null) {

			// como existe mas valores busco el ultimo nodo
			// busco uno a uno
			while (headCurr.getNext() != null) {
				headCurr = headCurr.getNext();
			}
			// como ya encontro el ultimo coloca como nodo siguiente
			// el actual
			headCurr.setNext(headTemp);
		}
		// incremento el valor del contador de nodos
		incrementCounter();
	}

	private void incrementCounter() {
		length++;
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node crunchifyCurrent = head.getNext();
			output = "[";
			while (crunchifyCurrent != null) {
				output += crunchifyCurrent.getData().toString();
				crunchifyCurrent = crunchifyCurrent.getNext();
				if (crunchifyCurrent != null)
					output += ",";
			}

		}
		output += "]";
		return output;
	}


	public Boolean find(Object buscado) {
		// reviso que la lista no esta vacia
		if (head != null) {
			Node crunchifyCurrent = head.getNext();
			// reviso que la lista si tenga valores siguientes
			Object valor;
			while (crunchifyCurrent != null) {
				valor = crunchifyCurrent.getData();
				if (buscado.equals(valor)) {
					return true;
				}
				crunchifyCurrent = crunchifyCurrent.getNext();
			}

		}
		return false;
	}

}
