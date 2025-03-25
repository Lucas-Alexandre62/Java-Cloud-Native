package Interfaces;

public class Main {
    public static void main(String[] args) {
        var music = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando musica");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Pausando musica");
            }

            @Override
            public void stopMusic() {
                System.out.println("Parando musica");
            }
        };

        music.playMusic();
    }
}
