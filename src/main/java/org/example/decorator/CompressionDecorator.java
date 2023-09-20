package org.example.decorator;

import lombok.Getter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DatasourceDecorator {
    @Getter
    private int compressionLevel = 6;

    public CompressionDecorator(Datasource datasource) {
        super(datasource);
    }

    public void setCompressionLevel(int value) {
        compressionLevel = value;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compressionLevel));

            dos.write(data);
            dos.close();
            bout.close();

            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException exception) {
            return null;
        }
    }

    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);

            int b;
            while ((b = inflaterInputStream.read()) != -1) {
                bout.write(b);
            }

            in.close();
            inflaterInputStream.close();
            bout.close();

            return new String(bout.toByteArray());
        } catch (IOException exception) {
            return null;
        }
    }
}