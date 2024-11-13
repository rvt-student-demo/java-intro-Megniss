package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class App
{

    public class Statistics {
        private int count;
        private int sum;
    
        public Statistics() {
            this.count = 0;
            this.sum = 0;
        }
    
        public void addNumber(int number) {
            this.count++;
            this.sum += number;
        }
    
        public int getCount() {
            return this.count;
        }
    
        public int getSum() {
            return this.sum;
        }
    
        public double average() {
            if (this.count == 0) {
                return 0;
            }
            return (double) this.sum / this.count;
        }
    }
    
    public class MainProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Statistics allNumbers = new Statistics();
            Statistics evenNumbers = new Statistics();
            Statistics oddNumbers = new Statistics();
    
            System.out.println("Enter numbers:");
            while (true) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == -1) {
                    break;
                }
                allNumbers.addNumber(number);
                if (number % 2 == 0) {
                    evenNumbers.addNumber(number);
                } else {
                    oddNumbers.addNumber(number);
                }
            }
            System.out.println("Count: " + allNumbers.getCount());
            System.out.println("Sum: " + allNumbers.getSum());
            System.out.println("Average: " + allNumbers.average());
            System.out.println("Sum of even numbers: " + evenNumbers.getSum());
            System.out.println("Sum of odd numbers: " + oddNumbers.getSum());
        }
    }
    
}
