package org.example.decorator;

public class DatasourceDecorator implements Datasource{
    private Datasource wrapper;

    public DatasourceDecorator(Datasource datasource) {
        this.wrapper = datasource;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}