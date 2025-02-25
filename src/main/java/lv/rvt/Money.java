package lv.rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents >= 100) {
            euros += cents / 100;
            cents = cents % 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }

        if (newEuros < 0) {
            return new Money(0, 0);
        }

        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        return euros + "." + (cents < 10 ? "0" : "") + cents + " euros";
    }

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(5, 50);

        System.out.println(a.plus(b));
        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(a)); 
        System.out.println(a.minus(b)); 
        System.out.println(b.minus(a));
    }
}
