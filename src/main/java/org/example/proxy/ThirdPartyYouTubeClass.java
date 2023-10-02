package org.example.proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        return null;
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos(){
        System.out.println("downloading populars...");

        experienceNetworkLatency();

        HashMap<String, Video> videos = new HashMap<>();
        videos.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        videos.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        videos.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        videos.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        videos.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.println("Done!"+"\n");
        return videos;
    }

    private Video getSomeVideo(String videoId){
        System.out.println("downloading video...");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("done!"+"\n");
        return video;
    }
}
