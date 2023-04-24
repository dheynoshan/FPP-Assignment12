package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        try{
            num = sc.nextInt();
            if(num<0 || num>100)
                throw new UnsupportedOperationException();
            else
                System.out.println("Entered number is: " + num);
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }catch (UnsupportedOperationException e){
            System.out.println("Input should be in between 0-100");
        }
    }
}
