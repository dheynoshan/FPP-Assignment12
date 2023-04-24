package problem2;

public class Main {
    public static void main(String[] args) {
        CustomerAccount ca = new CustomerAccount("NewCustomer");
        ca.deposit(1000);
        ca.withdraw(1500);
        System.out.println(ca.getBalance());
        ca.withdraw(700);
        System.out.println(ca.getBalance());
        ca.withdraw(200);
        System.out.println(ca.getBalance());
    }
}
