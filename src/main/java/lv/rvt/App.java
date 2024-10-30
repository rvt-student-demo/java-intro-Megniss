package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App

{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> birthYears = new ArrayList<>();
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
    
                String[] parts = input.split(",");
                names.add(parts[0]);
                birthYears.add(Integer.parseInt(parts[1]));
            }
            String longestName = "";
            for (String name : names) {
                if (name.length() > longestName.length()) {
                    longestName = name;
                }
            }
            int sum = 0;
            for (int year : birthYears) {
                sum += year;
            }
            double average = sum / (double) birthYears.size();
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + average);
        }
}
