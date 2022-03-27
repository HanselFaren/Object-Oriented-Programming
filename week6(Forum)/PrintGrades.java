import java.util.Scanner;
import java.util.Arrays;

public class PrintGrades {
    public static void main(String[] args){
        Scanner insert = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = insert.nextInt();
        
        do{
            System.out.println("Number cannot be negative or zero.");
            System.out.print("Enter the number of students: ");
            numStudents = insert.nextInt();
        }while(numStudents < 1)
                
        int[] grades = new int[numStudents];
        double average = 0;
        int minim = 100;
        int maxim = grades[0];
        int total = 0;
        
        for(int x = 0; x < grades.length ; x++){
            System.out.printf("Enter the grade for student %d: ", x+1);
            grades[x] = insert.nextInt();
            
            do{
                System.out.println("Grade can only be between 0-100.");
                System.out.print("Enter the grade fro students %d: ", x+1);
                grades[x] = insert.nextInt();
            }while(grades[x] < 0  && grades[x] > 100)
            total = total + grades[x];
        }
        
        for(int x = 0 ; x < grades.length ; x++){
            average += grades[x];
            if(grades[x] < minim){
                minim = grades[x];
            }
            if(grades[x] > maxim){
                maxim = grades[x];
            }
        }
        
        average = total / grades.length;
        
        System.out.printf("The average is: %.2f \n", average);
        System.out.println("The minimum is: " + minim);
        System.out.println("The maximum is: " + maxim);
    }
}
