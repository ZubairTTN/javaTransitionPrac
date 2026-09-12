package designPatterns.structuralDesignPattern.adapterPattern.Prac;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");     // Output: Playing mp3 file: song.mp3
        audioPlayer.play("mp4", "movie.mp4");    // Output: Playing mp4 file: movie.mp4
        audioPlayer.play("vlc", "clip.vlc");     // Output: Playing vlc file: clip.vlc
        audioPlayer.play("avi", "video.avi");    // Output: Invalid media. avi format not supported
    }
}

/* This traces exactly what happens when audioPlayer.play("vlc", "clip.vlc") runs.

Walking through the two paths shown above:

Path 1 — mp3 (no adapter needed): AudioPlayer.play() checks the type, sees "mp3", and handles it directly with its own built-in logic. The MediaAdapter is never touched — this is the "normal" case the interface was designed for.

Path 2 — vlc/mp4 (adapter kicks in):

AudioPlayer.play() sees the type isn't mp3, so it can't handle it natively.
It creates new MediaAdapter("vlc").
Inside the adapter's constructor, based on the type string, it instantiates the real underlying class — new VlcPlayer() — and stores it in the advancedMusicPlayer field. This is the moment the "incompatible" object gets created and hidden away.
Back in AudioPlayer, it calls mediaAdapter.play("vlc", "clip.vlc") — same method name as before, so AudioPlayer doesn't need any special-case code for adapters.
Inside MediaAdapter.play(), it checks the type again and delegates: advancedMusicPlayer.playVlc(fileName).
This finally reaches VlcPlayer.playVlc(), which prints the actual output.
Control unwinds back up the call stack to main().

The key insight from this trace: the client (AudioPlayer) only ever calls one method name — play() — on two different objects that both happen to implement MediaPlayer. It never calls playVlc() or playMp4() directly; the adapter is the only piece of code that knows those method names exist. That's the translation boundary in action. */
