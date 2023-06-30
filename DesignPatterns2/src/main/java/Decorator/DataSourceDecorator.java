package Decorator;

public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    DataSourceDecorator(DataSource s) {
        this.wrappee = s;
    }

    public void writeData(String data) {
        this.wrappee.writeData(data);
    }

    public String readData() {
        return this.wrappee.readData();
    }
}
