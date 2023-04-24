package problem2;

import java.util.InputMismatchException;

public class CustomerAccount {
    public static int cusCount = 0;
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName){
        this.cusName = cusName;
        this.accNo = genAccNo();
    }
    public boolean deposit (double amount){
        if(amount<0)
            return false;
        else{
            balance+=amount;
            return true;
        }
    }
    public boolean withdraw(double amount){
        try{
            if(amount>balance)
                throw new InsufficientBalanceException();
            else if((balance-amount)>=0 && (balance-amount)<=100)
                throw new MinimumBalanceException();
            else{
                balance-=amount;
                return true;
            }
        }catch(InsufficientBalanceException e){
            System.out.println("Balance is insufficient for withdraw.");
            return false;
        }catch (MinimumBalanceException e){
            System.out.println("Withdrawal exceeds the minimum balance.");
            return false;
        }catch(Exception e){
            System.out.println("Unknown Exception.");
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public String getCusName() {
        return cusName;
    }
    public String getAccNo() {
        return accNo;
    }
    private String genAccNo(){
        String s = "cus" + (++cusCount);
        return s;
    }


}
