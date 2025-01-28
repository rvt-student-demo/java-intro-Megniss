package lv.rvt;
import java.util.ArrayList;

public class App
{ 
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Teacher("Ada Lovelace", "London", 1200));
        persons.add(new Student("John Doe", "New York"));
        
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}