package player;

public class Mp3Music extends PopMusic {

    public Mp3Music(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file: " + name);
    }
}
