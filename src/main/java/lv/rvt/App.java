package lv.rvt;
import java.util.ArrayList;

public class App
{ 
        public static void main(String[] args) {
            ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
            
            juice.takeFromWarehouse(11.3);
            juice.addToWarehouse(1.0);
    
            System.out.println(juice.getName()); // Juice
            System.out.println(juice);           // Juice: balance = 989.7, space left 10.3
            System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
    
            juice.printAnalysis();
        }
}