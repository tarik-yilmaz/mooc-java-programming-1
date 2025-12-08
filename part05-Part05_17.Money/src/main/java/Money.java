
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int addEuros = this.euros() + addition.euros();
        int addCents = this.cents() + addition.cents();

        Money newMoney = new Money(addEuros, addCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        if (this.euros() > compared.euros()) {
            return false;
        }
        return this.cents() < compared.cents();
    }

    public Money minus(Money decreaser) {
        int decEuros = this.euros() - decreaser.euros();
        int decCents = this.cents() - decreaser.cents();

        if (decEuros >= 0) {
            if (decCents < 0) {
                decEuros -= 1;
                decCents += 100;
            }
        } else {
            decEuros = 0;
            decCents = 0;
        }

        Money newObject = new Money(decEuros, decCents);

        return newObject;
    }

}
