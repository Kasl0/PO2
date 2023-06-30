package Decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.util.Base64;

public class CompressionDecorator {

    private String compressedData;

    public void writeData(String data) {
        this.compressedData = data;
    }

    public String readData() {
        return compressedData;
    }

    public String getCompressedData() {
        return compressedData;
    }

    public void setCompressedData(String compressedData) {
        this.compressedData = compressedData;
    }
}
