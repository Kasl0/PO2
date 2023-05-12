package pl.agh.edu.dp.labirynth;

public class BombedWall extends MapSite implements IWall{

    public BombedWall(){

    }

    public void Enter() {
        System.out.println("Looked at the bombed wall!");
    }
}
