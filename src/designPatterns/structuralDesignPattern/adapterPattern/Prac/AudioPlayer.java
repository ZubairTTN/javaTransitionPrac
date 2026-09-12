package designPatterns.structuralDesignPattern.adapterPattern.Prac;
/* The original class the client actually uses */
public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
//        build-in support
        if(audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing mp3 file: " + fileName);
        }
//        use adapter for other formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " Format not supported");
        }
    }
}

