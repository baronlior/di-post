package blog.classic;

import blog.classic.artist.Artist;
import blog.classic.artist.Michelangelo;

public class PaintingApp {

    public static void main(String[] args) {
        new PaintingApp().run();
    }

    private void run() {
        Artist artist = new Michelangelo();
        System.out.println(artist.createArt("Hello World!"));
    }

}

