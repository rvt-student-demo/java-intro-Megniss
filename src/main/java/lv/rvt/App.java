package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class App
{ 
    public static void main(String[] args) {
        Box box = new Box(10, 5, 2);
        System.out.println(box);
        Box bigger = box.biggerBox();
        Box smaller = box.smallerBox();
        System.out.println("Bigger Box: " + bigger);
        System.out.println("Smaller Box: " + smaller);
        Box largeBox = new Box(20, 10, 5);
        System.out.println("Does box nest in largeBox? " + box.nests(largeBox));
        System.out.println("Does largeBox nest in box? " + largeBox.nests(box));
    }
}