package pl.agh.edu.dp.labirynth;

public class Door extends MapSite {
    private IRoom room1;
    private IRoom room2;

    public Door(IRoom r1, IRoom r2){
        this.room1 = r1;
        this.room2 = r2;
    }


    @Override
    public void Enter(){

    }

    public IRoom getRoom1() {
        return room1;
    }

    public void setRoom1(IRoom room1) {
        this.room1 = room1;
    }

    public IRoom getRoom2() {
        return room2;
    }

    public void setRoom2(IRoom room2) {
        this.room1 = room2;
    }
}
