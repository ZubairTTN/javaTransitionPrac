package designPatterns.structuralDesignPattern.adapterPattern.Prac;

/* The Adaptee (AdvancedMediaPlayer):

    This is the incompatible class (like a third-party library or legacy code). It has the cool features you want (like playing VLC or MP4), but its method names and structures (playVlc(), playMp4()) don't match what the Client expects. */

public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file: " + fileName);
    }
}

class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file: " + fileName);
    }
}

