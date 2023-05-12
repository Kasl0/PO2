package pl.agh.edu.dp.labirynth;

import java.util.Vector;

public class Maze {
    private Vector<IRoom> rooms;

    public Maze() {
        this.rooms = new Vector<IRoom>();
    }

    public void addRoom(IRoom room){
        rooms.add(room);
    }

    public void setRooms(Vector<IRoom> rooms) {
        this.rooms = rooms;
    }

    public int getRoomNumbers()
    {
        return rooms.size();
    }
}
