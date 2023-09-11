package org.example.observer;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File fileLog;

    public LogOpenListener(String fileName) {
        this.fileLog = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + fileLog + ": Someone has performed " + eventType +
                " operation with the following file: " + file.getName());
    }
}
