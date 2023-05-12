package pl.agh.edu.dp.labirynth;

public interface MazeBuilder {

    void buildMaze();

    Room buildRoom(int roomNumber);

    void buildDoor(Room from, Room to);

    void buildWall(Room room, Direction direction);

    Maze getMaze();
}
