package Interface.music.wind;


import Interface.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }
}