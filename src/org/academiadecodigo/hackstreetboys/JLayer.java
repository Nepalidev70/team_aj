package org.academiadecodigo.hackstreetboys;
import javazoom.jl.player.Player;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

    public class JLayer {
        public static class PlayMp3 extends Thread {
            private File mp3;
            private Player player;

            public void play(File mp3) {
                this.mp3 = mp3;
            }

            public void run() {
                try {
                    FileInputStream fis = new FileInputStream(mp3);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    this.player = new Player(bis);
                    System.out.println("Tocando Musica!");
                    this.player.play();
                    System.out.println("Terminado Musica!");
                } catch (Exception e) {
                    System.out.println("Problema ao tocar Musica" + mp3);
                    e.printStackTrace();
                }
            }
        }

    }



