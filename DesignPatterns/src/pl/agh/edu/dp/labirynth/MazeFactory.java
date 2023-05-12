package pl.agh.edu.dp.labirynth;

public class MazeFactory {

    private static MazeFactory instance;

    protected MazeFactory() {
    }

    public static MazeFactory getInstance() {
        if (instance == null) {
            instance = new MazeFactory();
        }
        return instance;
    }


    private Maze currentMaze;

    public void makeMaze() {
        currentMaze = new Maze();
    }

    public IRoom makeRoom(int roomNumber) {
        IRoom room = new Room(roomNumber);
        currentMaze.addRoom(room);
        return room;
    }

    public IWall makeWall(IRoom room, Direction direction) {
        IWall wall = new Wall();
        room.setSide(direction, (MapSite) wall);
        return wall;
    }

    public void makeDoor(IRoom from, IRoom to) {
        from.setSide(CommonWall(from, to), new Door(from, to));
        to.setSide(CommonWall(to, from), new Door(to, from));
    }

    public Maze getMaze() {
        return currentMaze;
    }

    private Direction CommonWall(IRoom r1, IRoom r2) {
        if (r1.getRoomNumber() - r2.getRoomNumber() < 0)
            return Direction.East;
        else
            return Direction.West;
    }
}
