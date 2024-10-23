package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
        System.out.print("From where? ");
        int startIndex = scanner.nextInt();
        System.out.print("To where? ");
        int endIndex = scanner.nextInt();
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }
}