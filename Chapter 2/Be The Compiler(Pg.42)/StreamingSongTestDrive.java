//Result : The file will not compile it need creation of object song of StreamingSong class.

//Updated file
class StreamingSong {
    String title;
    String artist;
    int duration;
    void play() {
        System.out.println("Playing song");
    }
    void printDetails() {
        System.out.println("This is " + title +
                " by " + artist);
    }
}
class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();         //creation of object
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
