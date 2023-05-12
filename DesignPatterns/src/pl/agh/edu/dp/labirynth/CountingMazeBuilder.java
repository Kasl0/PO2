package pl.agh.edu.dp.labirynth;

public class CountingMazeBuilder implements MazeBuilder {

    private int counter;

    public void buildMaze() {

    }

    public Room buildRoom(int roomNumber) {
        counter++;
        return null;
    }

    public void buildDoor(Room from, Room to) {
        counter++;
    }

    public void buildWall(Room room, Direction direction) {
        counter++;
    }

    public Maze getMaze() {
        return null;
    }

    public int getCounts() {
        return counter;
    }
}
