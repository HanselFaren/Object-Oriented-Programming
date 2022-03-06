import java.util.Scanner;
import java.lang.Math;

public class number10{
	public static void main(String[] args){
		Scanner insert = new Scanner(System.insert);
		
		System.out.print("Insert x1 = ");
		float x1 = insert.nextFloat();
		System.out.print("Insert x2 = ");
		float x2 = insert.nextFloat();
		System.out.print("Insert x3 = ");
		float x3 = insert.nextFloat();
		
		double mean = (x1 + x2 + x3) / 3;
		double variance = ((x1 - mean) * (x1 - mean) + (x2 - mean) * (x2 - mean) + (x3 - mean) * (x3 - mean)) / 3;
		double deviation = Math.sqrt(variance);
		
		System.out.println("Mean = " + mean);
		System.out.println("Variance = " + variance);
		System.out.println("Deviation = " + deviation);
		
		insert.close();
	}
}
