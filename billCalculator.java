package JAVA_MCA;
/*
In this program we calculate the bill in different categories 
*/

import java.util.Scanner;
public class billCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total units: ");
        int units = scanner.nextInt();
        if(units <= 150 ) {
          double amount = (150)*2.2 ;
            System.out.println("the charges are : " + amount);
        }
        if(units > 150 & units <= 300) {
          double amount = (150)*2.2 + (units-150)*3.5;
            System.out.println("the charges are : " + amount);
        }
        if(units > 300) {
          double amount = (150)*2.2 + (150)*3.5 + (units-300)*5.5;
            System.out.println("the charges are : " + amount);
        }
      

    scanner.close();
    }
}
