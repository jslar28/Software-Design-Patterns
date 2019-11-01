package CreationalPatterns._MazeGameComparison.WithBuilder;

public class Door extends MapSite {
    private Room roomOne;
    private Room roomTwo;
    private boolean isOpen;

    Door(Room from, Room to) {
        roomOne = from;
        roomTwo = to;
    }

    Room getRoomOnOtherSide(Room room) {
        if (roomOne.getRoomNumber() == room.getRoomNumber())
            return roomTwo;
        return roomOne;
    }

    @Override
    void onEnter() {
        System.out.println("Entered door from room "+ roomOne.getRoomNumber() +
                " to " + roomTwo.getRoomNumber());
    }

    public String toString() {
        return "DOOR";
    }
}
