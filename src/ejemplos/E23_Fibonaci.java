package ejemplos;

public class E23_Fibonaci {

	static int closestFibonacci(int val){
	 int n1=1;
	 int n2= 1;
	 int n3=0;
	 while (n2<=val){
		 n3= n2+n1;
		 n1=n2;
		 n2=n3;
		 n3=0;
		 System.out.println(n2);
	 }
	return n1;
}
	public static void main(String[] args) {
		
System.out.println("mas cerca fibonacci de 12: " + closestFibonacci(12));
System.out.println("mas cerca fibonacci de 33: " + closestFibonacci(33));
System.out.println("mas cerca fibonacci de 34: " + closestFibonacci(34));
System.out.println("mas cerca fibonacci de 1: " + closestFibonacci(1));
System.out.println("mas cerca fibonacci de 2: " + closestFibonacci(2));
	}

}
