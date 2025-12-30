package player;

public class WavMusic extends RockMusic {

    public WavMusic(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing WAV file: " + name);
    }
}
