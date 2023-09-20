package org.example.decorator;

import java.io.*;

public class FileDatasource implements Datasource {
    private String name;

    public FileDatasource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(data.getBytes(), 0, data.length());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        return new String(buffer);
    }
}