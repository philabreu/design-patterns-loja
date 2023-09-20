package org.example.decorator;

public interface Datasource {
    void writeData(String data);

    String readData();
}
