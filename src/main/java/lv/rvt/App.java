package lv.rvt;
import java.util.Scanner;
public class App
{
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            int evenCount = 0;
            int oddCount = 0;
            
            System.out.println("Give numbers:");
            
            while (true) {
                int number = scanner.nextInt();
                
                if (number == -1) {
                    System.out.println("Thx! Bye!");
                    break;
                }
                
                sum += number;
                count++;
                
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            double average = (double) sum / count;
            
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + count);
            System.out.println("Average: " + average);
            System.out.println("Even: " + evenCount);
            System.out.println("Odd: " + oddCount);
        }
    }
    
}