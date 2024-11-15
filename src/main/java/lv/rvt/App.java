package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class App
{
        public static void main(String[] args) {
                PaymentCard card = new PaymentCard(50);
            System.out.println(card);
        
                PaymentCard card2 = new PaymentCard(50);
            System.out.println(card2);
    
            card2.eatAffordably();
            System.out.println(card2);
    
            card2.eatHeartily();
            card2.eatAffordably();
            System.out.println(card2);
            
                PaymentCard card3 = new PaymentCard(5);
            System.out.println(card3);
    
            card3.eatHeartily();
            System.out.println(card3);
    
            card3.eatHeartily();
            System.out.println(card3);
            
                PaymentCard card4 = new PaymentCard(10);
            System.out.println(card);
    
            card4.addMoney(15);
            System.out.println(card4);
    
            card4.addMoney(10);
            System.out.println(card4);
    
            card4.addMoney(200);
            System.out.println(card4);
        
            PaymentCard card5 = new PaymentCard(10);
            System.out.println("Paul: " + card5);
            card5.addMoney(-15);
            System.out.println("Paul: " + card5);

            PaymentCard paulsCard = new PaymentCard(20);
            PaymentCard mattsCard = new PaymentCard(30);
    
            paulsCard.eatHeartily();
            mattsCard.eatAffordably();

            System.out.println("Paul " +paulsCard);
            System.out.println("Matt " +mattsCard);

            paulsCard.addMoney(20);
            mattsCard.eatHeartily();

            System.out.println("Paul " +paulsCard);
            System.out.println("Matt " +mattsCard);

            paulsCard.eatAffordably();
            mattsCard.eatAffordably();

            mattsCard.addMoney(50);

            System.out.println("Paul " +paulsCard);
            System.out.println("Matt " +mattsCard);
        }
}