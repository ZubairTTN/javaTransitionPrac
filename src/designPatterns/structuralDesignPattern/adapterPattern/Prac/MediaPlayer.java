package designPatterns.structuralDesignPattern.adapterPattern.Prac;

/* The Client (MediaPlayer interface):

    This is your main application code. It only knows how to speak one "language"—the MediaPlayer interface (e.g., calling a simple play() method). It refuses to deal with anything else.
    The Target Interface (MediaPlayer):

    The expected contract. The Client is hardcoded to work with this specific interface.*/

public interface MediaPlayer {
    public abstract void play(String audioType, String fileName);
}
