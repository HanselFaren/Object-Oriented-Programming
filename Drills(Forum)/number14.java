import java.util.Scanner;

public class number14{
	public static void main(String[] args){
		Scanner insert = new Scanner(System.insert);
		System.out.print("Insert number in seconds = ");
		int seconds = insert.nextInt();
		
		int hour = seconds / 3600;
		int min = (seconds % 3600) / 60;
		int sec = (seconds % 3600) % 60;
		
		System.out.println(seconds + " seconds are " + hour + " hour, " + min + " minute, " + sec + " seconds");
	}
}