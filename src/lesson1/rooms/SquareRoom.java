package lesson1.rooms;

/**
 * Created by asv on 24.11.16.
 */
public class SquareRoom extends Room {
    private int sideA;
    private int sideB;

    public SquareRoom(String s) {}

    public SquareRoom(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String calculateSquare() {
        return String.valueOf(sideA * sideB)
                + " and i have - " + visitors + " visitors!";
    }

}
