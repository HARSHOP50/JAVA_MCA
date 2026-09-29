import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle : ");
        int principle = scanner.nextInt();
        System.out.print("Enter the time duration in years : ");
        int time = scanner.nextInt();
        System.out.print("Enter the rate per annum : ");
        double rate = scanner.nextDouble();
        System.out.print("Enter 1 if compound annually else enter no. of months : ");
        int n = scanner.nextInt();
        double compoundInterest = principle*Math.pow((1+(rate/(100*n))),(n*time));
        scanner.close();
       System.out.printf("The Total amount is: %.2f%n", compoundInterest);
       System.out.printf("The Total interest is: %.2f%n", Math.abs(compoundInterest - principle));
    }
    
}
