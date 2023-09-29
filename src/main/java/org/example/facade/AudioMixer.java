package org.example.facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("audiomixer: fixing audio...");
        return new File("tmp");
    }
}
