import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual interest, for example, 8.25: ");
        String interestStr = scan.nextLine();
        System.out.print("Enter number of years as an integer: ");
        String yearsStr = scan.nextLine();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        String loanStr = scan.nextLine();
        double interest = interestStr.isEmpty() ? 0 : Double.parseDouble(interestStr);
        int years = yearsStr.isEmpty() ? 0 : Integer.parseInt(yearsStr);
        double loan = loanStr.isEmpty() ? 0 : Double.parseDouble(loanStr);
        Loan loan1 = null;
        if (interest==0 && years==0 && loan==0) {
            loan1 = new Loan();
        }
        else if (interest!=0 && years!=0 && loan!=0){
            loan1 = new Loan(interest, years, loan);
        }
        else {
            System.out.println("Error! Values should not be 0!");
            System.exit(1);
        }
        System.out.println("The loan was created on " + new Date());
        System.out.println(String.format("The monthly payment is: %.2f", loan1.getMonthlyPayment()));
        System.out.println(String.format("The total payment is: %.2f", loan1.getTotalPayment()));
    }
}