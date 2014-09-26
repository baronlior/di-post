package blog.classic;

import blog.classic.artist.Artist;


/**
 * illustrate the use of service locator pattern
 */
public class PaintingAppSL {

    public static void main(String[] args) {
        new PaintingAppSL().run();
    }

    private void run() {
        Artist artist = (Artist) ServiceLocator.create("the artist");
        System.out.println(artist.createArt("Hello World!"));
    }

}


