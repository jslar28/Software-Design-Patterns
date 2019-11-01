package CreationalPatterns._MazeGameComparison.WithAbstractFactory;

import java.util.ArrayList;

class Maze {
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
}
