import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = insert.nextInt();
        
        do{
            System.out.println("Number cannot be negative or zero.");
            System.out.print("Enter the number of items: ");
            NUM_ITEMS = insert.nextInt();
        }while(NUM_ITEMS < 1)
                
        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = new int[NUM_ITEMS];
        
        for(int x = 0; x < items.length ; x++)
        {
            items[x] = insert.nextInt();
        }
        
        System.out.println("The values are: " + Arrays.toString(items));
    }
}
