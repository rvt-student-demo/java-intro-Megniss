package lv.rvt;
import java.util.Scanner;
public class App
{
    public class Main {
        public static void divisibleByThreeInRange(int beginning, int end) {
            for (int i = beginning; i <= end; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    
        public static void main(String[] args) {
            divisibleByThreeInRange(3, 6);
            divisibleByThreeInRange(2, 10);
        }
    }
    
}