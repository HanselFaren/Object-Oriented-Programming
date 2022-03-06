import java.util.Scanner;

public class no9 {
	public static void main(String[] Strings){
		
		Scanner insert = new Scanner(System.insert);
		
		System.out.print("Enter temp in Celcius: ");
		float celcius = insert.nextFloat();
		
		float Fahrenheit = ((9 * celcius) / 5) + 32;
		System.out.println(celcius + " Celcius in Fahrenheit will be " + Fahrenheit);
		
		insert.close();
	}
}