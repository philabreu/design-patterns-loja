package org.example;

import org.example.decorator.*;

import java.io.FileOutputStream;

public class DemoDecorator {
    public static void main(String[] args) {
        String salaryRecords = "Name, salary\nJohn Smith, 100000\nSteve Jobs, 912000";
        DatasourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDatasource("out/OutputDemo.txt")
                )
        );

        encoded.writeData(salaryRecords);
        Datasource plain = new FileDatasource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

    }
}
