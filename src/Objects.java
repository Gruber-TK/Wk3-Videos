import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 34;   // this is primitive data type. it has 1 value and nothing more 
		
		String name = "Sally Mae";  // this is an object 
		System.out.println(name.length());   // on a string length is a method, so it needs a ( ) 
		
		System.out.println(name.charAt(6));
		
		Scanner s = new Scanner(System.in);
		
		
		int[] numbers = new int[3];      // this is an array, and an array is an object
		System.out.println(numbers.length);    // on an array a length is a property so it does not need ()
		
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x == y);
		
		
		String c = new String("Hello");
		String d = c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		
		
		
	}

}
