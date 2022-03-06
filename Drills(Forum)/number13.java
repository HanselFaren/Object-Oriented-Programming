import java.util.Scanner;
import java.lang.Math;

public class number13{
	public static void main(String[] args){
		Scanner insert = new Scanner(System.insert);
		System.out.print("Insert a = ");
		float a = insert.nextFloat();
		System.out.print("Insert b = ");
		float b = insert.nextFloat();
		System.out.print("Insert c = ");
		float c = insert.nextFloat();
		
		float result;
		
		if (a == 0){
			result = -c / b;
			System.out.println(result);
		} else{
			result = (-b + (float)Math.sqrt((float)Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println(result);
		}
	}
}