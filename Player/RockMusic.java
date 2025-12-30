package player;

public class RockMusic extends Music {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing ROCK music: " + name);
    }
}
