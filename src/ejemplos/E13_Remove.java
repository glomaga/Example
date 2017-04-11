package ejemplos;

import java.util.LinkedList;

public class E13_Remove {
	
	static LinkedList remove(LinkedList a, String val){
		
		a.remove(val);
		
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		a.add("f");
		
		System.out.println(a);
		
		System.out.println(remove(a,"c"));
		
	
		
	}

}
