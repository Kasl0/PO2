package Decorator;

public class EncryptionDecorator implements DataSource {

    private String encryptedData;

    public void writeData(String data) {
        StringBuilder reversed = new StringBuilder(data);
        reversed.reverse();
        this.encryptedData = reversed.toString();
    }

    public String readData() {
        StringBuilder reversed = new StringBuilder(this.encryptedData);
        reversed.reverse();
        return reversed.toString();
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }
}
