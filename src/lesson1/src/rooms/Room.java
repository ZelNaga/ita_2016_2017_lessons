package rooms;

/**
 * Created by asv on 24.11.16.
 */
public abstract class Room {
    protected int visitors;

    public abstract String calculateSquare();

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }
}
