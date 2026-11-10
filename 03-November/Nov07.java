
interface Camera {
    void takePhoto();
    void recordVideo();
}

interface Music {
    void playMusic();
    void stopMusic();
}

class Smartphone implements Camera, Music {

    public void takePhoto() {
        System.out.println("Taking a photo ");
    }

    public void recordVideo() {
        System.out.println("Recording a video");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }

    public void stopMusic() {
        System.out.println("Music stopped");
    }
}

public class Nov7 {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        s.takePhoto();
        s.recordVideo();
        s.playMusic();
        s.stopMusic();
    }
}
