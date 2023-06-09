package pl.agh.edu.dp.labirynth;

import java.util.EnumMap;
import java.util.Map;

public class BombedRoom extends MapSite implements IRoom {

    private int roomNumber;
    private Map<Direction, MapSite> sides;


    public BombedRoom(int number){
        this.sides = new EnumMap<>(Direction.class);
        this.roomNumber = number;
    }

    public MapSite getSide(Direction direction){
        return this.sides.get(direction);
    }

    public void setSide(Direction direction, MapSite ms){
        this.sides.put(direction, ms);
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public void Enter(){
        System.out.println("Entered bombed room!");
    }
}
