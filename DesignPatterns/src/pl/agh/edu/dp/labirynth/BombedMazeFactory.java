package pl.agh.edu.dp.labirynth;

public class BombedMazeFactory extends MazeFactory {

    private static BombedMazeFactory instance;

    private BombedMazeFactory() {
    }

    public static BombedMazeFactory getInstance() {
        if (instance == null) {
            instance = new BombedMazeFactory();
        }
        return instance;
    }

    public BombedRoom makeRoom(int roomNumber) {
        BombedRoom room = new BombedRoom(roomNumber);
        currentMaze.addRoom(room);
        return room;
    }

    public BombedWall makeWall(IRoom room, Direction direction) {
        BombedWall wall = new BombedWall();
        room.setSide(direction, (MapSite) wall);
        return wall;
    }

}
