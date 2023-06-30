package Decorator;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileDataSource implements DataSource {

    private String filename;

    FileDataSource(String filename) {
        this.filename = filename;
    }

    public void writeData(String data) {

        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file);

            EncryptionDecorator ed = new EncryptionDecorator();
            CompressionDecorator cd = new CompressionDecorator();
            ed.writeData(data);
            cd.writeData(ed.getEncryptedData());
            writer.write(cd.getCompressedData());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readData() {

        StringBuilder content = new StringBuilder();

        try {
            File file = new File(filename);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        CompressionDecorator cd = new CompressionDecorator();
        EncryptionDecorator ed = new EncryptionDecorator();
        cd.setCompressedData(content.toString());
        ed.setEncryptedData(cd.readData());

        return ed.readData();
    }
}
