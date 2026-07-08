package Interface.music.string;



import Interface.music.Playable;

public class Veena implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Veena");
    }
}