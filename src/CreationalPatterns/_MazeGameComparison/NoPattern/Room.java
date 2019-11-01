package CreationalPatterns._MazeGameComparison.NoPattern;

import java.util.HashMap;

class Room extends MapSite {
    private HashMap<Direction, MapSite> sides = new HashMap<>();

    private int roomNumber;

    int getRoomNumber() {
        return roomNumber;
    }

    Room(int i) {
        roomNumber = i;
    }

    void setSide(Direction direction, MapSite site) {
        sides.put(direction, site);
    }

    MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    @Override
    void onEnter() {
        System.out.println("Entered room " + roomNumber);
    }

    String mapToString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = "";
        for (int i = 0; i < sides.size(); i++) {
            string = stringBuilder.append(sides.keySet().toArray()[i])
                    .append(":")
                    .append(sides.values().toArray()[i].toString())
                    .append(" ").toString();
        }
        return string;
    }

    public String toString() {
        return mapToString();
    }
}
