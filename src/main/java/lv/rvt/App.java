package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args) {
        HealthStation station = new HealthStation();

        Person john = new Person("John", 70);
        Person emma = new Person("Emma", 65);

        System.out.println(john.getName() + "'s weight: " + station.weigh(john));
        System.out.println(emma.getName() + "'s weight: " + station.weigh(emma));

        station.feed(john);
        station.feed(john);

        System.out.println(john.getName() + "'s weight after feeding: " + station.weigh(john));

        System.out.println("Total weighings performed: " + station.weighings());
    }
}