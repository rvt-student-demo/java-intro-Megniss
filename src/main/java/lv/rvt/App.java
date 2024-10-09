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
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ievadiet diapazona sākumu: ");
        int beginning = scanner.nextInt();
        
        System.out.print("Ievadiet diapazona beigas: ");
        int end = scanner.nextInt();
        
        divisibleByThreeInRange(beginning, end);
    }
}

}