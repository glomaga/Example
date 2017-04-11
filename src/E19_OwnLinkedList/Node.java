package E19_OwnLinkedList;

public class Node {
Node next;
Object data;

public Node(Object data) {
	this.data = data;
}
public Node getNext() {
	return next;
}

// these methods should be self-explanatory
public Object getData() {
	return data;
}


public void setData(Object dataValue) {
	data = dataValue;
}



public void setNext(Node nextValue) {
	next = nextValue;
}

}
