package lesson1;

import lesson1.rooms.*;

public class Main {

    public static void main(String[] args) {

        SquareRoom squreRoom = new SquareRoom(3, 6);
        RoundRoom roundRoom = new RoundRoom(5);
        squreRoom.setVisitors(6);
        roundRoom.setVisitors(15);
        printRoomSqure(squreRoom);
        printRoomSqure(roundRoom);
    }

    public static void printRoomSqure(Room room) {
        System.out.println(room.calculateSquare());
    }
}
