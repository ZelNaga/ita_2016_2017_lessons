package lesson1.rooms;

/**
 * Created by asv on 24.11.16.
 */
public class RoundRoom extends Room {
    private int radius;

    public RoundRoom(int radius) {
        this.radius = radius;
    }

    @Override
    public String calculateSquare() {
        return getRoomType()
                + String.valueOf(Math.PI * Math.pow(radius, 2) * 2)
                + " and i have - " +  visitors + " visitors!";
    }

    private String getRoomType() {
        return "I am round room - ";
    }
}
