package pl.agh.edu.dp.labirynth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    public Player(IRoom startingRoom) {
        this.room = startingRoom;
    }

    private IRoom room;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void readInput() {
        try {
            parse(br.readLine());
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void parse(String key) {

        switch (key) {
            case "w":
                makeAction(room.getSide(Direction.North));
                break;
            case "s":
                makeAction(room.getSide(Direction.South));
                break;
            case "a":
                makeAction(room.getSide(Direction.West));
                break;
            case "d":
                makeAction(room.getSide(Direction.East));
                break;
            case "e":
                System.exit(0);
                break;
            default:
                System.out.println("Unknown key was pressed.");
                break;
        }
    }

    private void makeAction(MapSite ms) {
        if (ms instanceof IWall) {
            ms.Enter();
            System.out.println("There is a wall.");
        }
        else if (ms instanceof Door) {
            room = ((Door) ms).getRoom2();
            room.Enter();
            System.out.print("Going through the door. Now in room ");
            System.out.println(room.getRoomNumber());
        }
        else {
            System.out.println("Don't know what I am looking at.");
        }
    }

}
