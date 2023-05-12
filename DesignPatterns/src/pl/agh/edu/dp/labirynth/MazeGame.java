package pl.agh.edu.dp.labirynth;

public class MazeGame {
    public Maze createMaze(MazeBuilder builder){

        builder.buildMaze();

        Room r1 = builder.buildRoom(1);
        Room r2 = builder.buildRoom(2);

        builder.buildDoor(r1, r2);

        builder.buildWall(r1, Direction.North);
        builder.buildWall(r1, Direction.East);
        builder.buildWall(r1, Direction.South);
        builder.buildWall(r1, Direction.West);

        builder.buildWall(r2, Direction.North);
        builder.buildWall(r2, Direction.East);
        builder.buildWall(r2, Direction.South);
        builder.buildWall(r2, Direction.West);

        return builder.getMaze();
    }
}
