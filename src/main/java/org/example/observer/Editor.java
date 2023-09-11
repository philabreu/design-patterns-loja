package org.example.observer;

import java.io.File;
import java.util.Objects;

import static java.util.Objects.nonNull;

public class Editor {
    public EventManager event;
    private File file;

    public Editor() {
        this.event = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        event.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (nonNull(this.file)) {
            event.notify("save", file);
        } else {
            throw new Exception("please open a file first");
        }
    }
}
