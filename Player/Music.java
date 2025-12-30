package player;

public  class Music {

    public String name;

    public Music(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing music: " + name);
    }

    public String getName() {
        return name;
    }
}
