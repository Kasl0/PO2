package Decorator;

public class Main {

    public static void main(String[] args) {

        FileDataSource fd = new FileDataSource("src/main/resources/abc.txt");
        fd.writeData("Hello world!");
        System.out.println(fd.readData());
    }
}
