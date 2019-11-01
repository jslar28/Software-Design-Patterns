package CreationalPatterns._MazeGameComparison.WithPrototype;

import java.util.ArrayList;

class Maze implements Cloneable {
    private ArrayList<Room> rooms = new ArrayList<>();

    void addRoom(Room room) {
        rooms.add(room);
    }

    Room getRoom(int roomNumber) {
        for (Room room: rooms) {
            if (room.getRoomNumber() == roomNumber)
                return room;
        }
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    ArrayList<Room> getRooms() {
        return rooms;
    }
}
