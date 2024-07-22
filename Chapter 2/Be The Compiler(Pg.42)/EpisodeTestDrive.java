//Result : The file will not compile, need play method in the Episode class

//Updated file
class Episode {
    int seriesNumber;
    int episodeNumber;
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
    void play() {                                        //added play method int the class
        System.out.println("Playing episode " + episodeNumber);
    }
}
class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipIntro();
    }
}
