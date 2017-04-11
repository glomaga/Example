package Other;


public class StringBuilderDemo {

   public static void main(String[] args) {
  
   StringBuilder str = new StringBuilder("india");
   System.out.println("string = " + str);

   // reverse characters of the StringBuilder and prints it
   System.out.println("reverse = " + str.reverse());
  
   // reverse is equivalent to the actual
   str = new StringBuilder("malayalam");
   System.out.println("string = " + str);
	
   // reverse characters of the StringBuilder and prints it
   System.out.println("reverse = " + str.reverse());
   }
}