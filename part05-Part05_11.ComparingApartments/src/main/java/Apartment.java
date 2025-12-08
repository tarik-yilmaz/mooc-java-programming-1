
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceOfThis = this.squares * this.princePerSquare;
        int priceOfCompared = compared.squares * compared.princePerSquare;
        
        int difference = priceOfThis - priceOfCompared;
        if (difference < 0) {
            // multiply with -1 for the absolute value
            difference *= -1;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int priceOfThis = this.squares * this.princePerSquare;
        int priceOfCompared = compared.squares * compared.princePerSquare;

        if (priceOfThis > priceOfCompared) {
            return true;
        }

        return false;
    }

}
