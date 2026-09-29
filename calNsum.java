// in this we calculate the sum of n no. using while loop
import java.util.Scanner;
public class calNsum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int x = scanner.nextInt();
        int i = 0;
        int sum = 0;
        if(x<0){
            System.out.println("the sum is 0");
        }
        while(i<=x){
            sum += i;
            i +=1;

        }
        scanner.close();
        System.out.println("the sum of n natural no. numbers : " + sum);
    }
}