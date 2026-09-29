import java.util.Scanner;
public class calculateN_NOsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int number = scanner.nextInt();
        System.out.println("The sum of n numbers is : " + (number*(number+1))/2);
        scanner.close();

    }
    
}
