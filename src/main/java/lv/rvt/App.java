package lv.rvt;
import java.util.Scanner;
public class App
{
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Stars.printRectangle(17, 3);
        scanner.close();
    }
    public static void divisibalByThreeInRange(int begining, int end){
        for(int i = begining; i <= end; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}