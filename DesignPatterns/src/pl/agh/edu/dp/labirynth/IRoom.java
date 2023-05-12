package pl.agh.edu.dp.labirynth;

public interface IRoom {

    MapSite getSide(Direction direction);

    void setSide(Direction direction, MapSite ms);

    int getRoomNumber();
}
