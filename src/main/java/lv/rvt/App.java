package lv.rvt;
import java.util.Scanner;
public class App
{

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            
            System.out.println("Give numbers:");
            
            while (true) {
                int number = scanner.nextInt();
                
                if (number == -1) {
                    System.out.println("Thx! Bye!");
                    break;
                }
                
                sum += number;
                count++;
            }
            
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + count);
        }
    }
    
}