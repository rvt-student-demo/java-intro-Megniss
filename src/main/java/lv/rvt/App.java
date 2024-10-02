package lv.rvt;
import java.util.Scanner;
public class App
{

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to enter? ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The sum of the numbers is: " + sum);

        System.out.println("The sum is: " + sum);
        System.out.println("The number of numbers is: " + n);

        double average = (double) sum / n;
        System.out.println("The average of the numbers is: " + average);

        System.out.println("The number of even numbers is: " + evenCount);
        System.out.println("The number of odd numbers is: " + oddCount);
    }
}

}