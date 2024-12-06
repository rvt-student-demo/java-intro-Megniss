package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class App
{ public static void main(String[] args) {
    System.out.println("=== PaymentCard Tests ===");
    PaymentCard petesCard = new PaymentCard(10);
    System.out.println("money " + petesCard.balance());
    boolean wasSuccessful = petesCard.takeMoney(8);
    System.out.println("successfully withdrew: " + wasSuccessful);
    System.out.println("money " + petesCard.balance());

    wasSuccessful = petesCard.takeMoney(4);
    System.out.println("successfully withdrew: " + wasSuccessful);
    System.out.println("money " + petesCard.balance());
    System.out.println("\n=== PaymentTerminal Cash Tests ===");
    PaymentTerminal unicafeExactum = new PaymentTerminal();

    double change = unicafeExactum.eatAffordably(10);
    System.out.println("remaining change: " + change);

    change = unicafeExactum.eatAffordably(5);
    System.out.println("remaining change: " + change);

    change = unicafeExactum.eatHeartily(4.3);
    System.out.println("remaining change: " + change);

    System.out.println(unicafeExactum);
    System.out.println("\n=== PaymentTerminal Card Tests ===");
    PaymentCard annesCard = new PaymentCard(7);

    wasSuccessful = unicafeExactum.eatHeartily(annesCard);
    System.out.println("there was enough money: " + wasSuccessful);
    wasSuccessful = unicafeExactum.eatHeartily(annesCard);
    System.out.println("there was enough money: " + wasSuccessful);
    wasSuccessful = unicafeExactum.eatAffordably(annesCard);
    System.out.println("there was enough money: " + wasSuccessful);

    System.out.println(unicafeExactum);
    System.out.println("\n=== Add Money to Card Tests ===");
    PaymentCard cardForAddingMoney = new PaymentCard(2);
    System.out.println("amount of money on the card is " + cardForAddingMoney.balance() + " euros");

    wasSuccessful = unicafeExactum.eatHeartily(cardForAddingMoney);
    System.out.println("there was enough money: " + wasSuccessful);

    unicafeExactum.addMoneyToCard(cardForAddingMoney, 100);

    wasSuccessful = unicafeExactum.eatHeartily(cardForAddingMoney);
    System.out.println("there was enough money: " + wasSuccessful);

    System.out.println("amount of money on the card is " + cardForAddingMoney.balance() + " euros");

    System.out.println(unicafeExactum);
}
}