package pl.agh.edu.dp.labirynth;

public class StandardBuilderMaze implements MazeBuilder {

    private Maze currentMaze;

    public void buildMaze() {
        currentMaze = new Maze();
    }

    public Room buildRoom(int roomNumber) {
        Room room = new Room(roomNumber);
        currentMaze.addRoom(room);
        return room;
    }

    public void buildDoor(Room from, Room to) {
        from.setSide(CommonWall(from, to), new Door(from, to));
        to.setSide(CommonWall(to, from), new Door(to, from));
    }

    public void buildWall(Room room, Direction direction) {
        room.setSide(direction, new Wall());
    }

    public Maze getMaze() {
        return currentMaze;
    }

    private Direction CommonWall(Room r1, Room r2) {
        if (r1.getRoomNumber() - r2.getRoomNumber() < 0)
            return Direction.East;
        else
            return Direction.West;
    }
}
