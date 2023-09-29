package org.example.facade;

import lombok.Getter;

public class VideoFile {
    @Getter
    private String name;
    @Getter
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }
}
