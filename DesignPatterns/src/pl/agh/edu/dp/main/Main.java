package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;

public class Main {

    public static void main(String[] args) {

        BombedMazeFactory factory1 = BombedMazeFactory.getInstance();
        BombedMazeFactory factory2 = BombedMazeFactory.getInstance();
        if (factory1 == factory2) {
            System.out.println("factory1 is the same object as factory2");
        }
        else {
            System.out.println("factory1 and factory2 are not the same objects");
        }

        MazeGame mazeGame = new MazeGame();
        Maze maze = mazeGame.createMaze(factory1);

        Player player = new Player(maze.getRoom(1));
        while (true) {
            player.readInput();
        }
    }
}
