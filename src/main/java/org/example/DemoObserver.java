package org.example;

import org.example.observer.Editor;
import org.example.observer.EmailNotificationListener;
import org.example.observer.LogOpenListener;

public class DemoObserver {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.event.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.event.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}