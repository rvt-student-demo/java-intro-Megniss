package lv.rvt;

public class App 
{
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Give the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        scanner.close();
    }
}

}