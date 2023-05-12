package pl.agh.edu.dp.labirynth;

public class MazeGame {
    public Maze createMaze(MazeFactory factory){

        factory.makeMaze();

        IRoom r1 = factory.makeRoom(1);
        IRoom r2 = factory.makeRoom(2);

        factory.makeWall(r1, Direction.North);
        factory.makeWall(r1, Direction.East);
        factory.makeWall(r1, Direction.South);
        factory.makeWall(r1, Direction.West);

        factory.makeWall(r2, Direction.North);
        factory.makeWall(r2, Direction.East);
        factory.makeWall(r2, Direction.South);
        factory.makeWall(r2, Direction.West);

        factory.makeDoor(r1, r2);

        return factory.getMaze();
    }
}
