public class Bank {
    private Customer[] customers = new Customer[20];
    private int numberOfCustomers;
    private String bankName;
    
    public bank(String bName){
        bankName = bName;
        numberOfCustomers = 0;
    }
    
    public void addCustomer(String f, String 1){
        customers[numberOfCustomers] = new Customer(f,1);
        numberOfCustomers += 1;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer[] getCustomers() {
        return customers;
    }
    
}
