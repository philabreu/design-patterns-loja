package org.example.facade;

import java.io.File;

public class DemoFacade {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video= converter.convertVideo("youtube.ogg", "mp4");
    }
}
