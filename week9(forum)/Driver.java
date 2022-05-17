import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Scanner insert = new Scanner(System.ins);
        
        Bank HiBank = new Bank("Death Bank");
        
        boolean start = true;
        while(start){
            System.out.println("Main Menu:");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign in");
            System.out.println("3. Exit");
            System.out.println("Your Choice -> ");
            
            int choose = input.nextInt();
            
            switch(choose){
                case 1:
                    System.out.println("Insert firstname:");
                    String fn = insert.nextLine();
                    System.out.println("Insert lastname:");
                    String ln = insert.nextLine();
                    HiBank.addCustomer(fn, ln);
                    break;
                    
                case 2:
                    while(start){
                        System.out.println("Choose option: ");
                        System.out.println("1. Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Quit");
                        System.out.print("Your Choice >> ");
                        
                        int option = input.nextInt();
            
                        switch(option){
                            case 1: 
                                System.out.print("Your current balance: " + account.getBalance());
                                break;
            
                            case 2: 
                                System.out.print("Enter your deposit amount: ");
                                int store = input.nextInt();
                                if(store > 0){ 
                                    account.deposit(store);
                                    System.out.println("Deposit Succeed");
                                    System.out.println("Your balance now: " + account.getBalance());
                                }else{
                                    System.out.println("Deposit Fail");
                                    System.out.println("Your balance: " + account.getBalance());
                                }
                                break;
            
                            case 3: 
                                System.out.print("Enter the withdraw amount: ");
                                int take = input.nextInt();
                                
                                if(take > 0){ 
                                    account.withdraw(take);
                                    System.out.println("Withdraw Succeed");
                                    System.out.println("Your balance now: " + account.getBalance());
                                }else{
                                    System.out.println("Withdraw Fail");
                                    System.out.println("Your balance now " + account.getBalance());
                                }
                                break;
            
                            case 4: 
                                start = false;
                                break;
                        }
                    } 
                case 3:
                    System.out.println("Thank you for coming");
                    start = false;
                    break;
            }
        }
        input.close();
    }
}
