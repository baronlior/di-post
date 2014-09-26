package blog.di;

import blog.di.artist.Artist;
import com.google.inject.*;

public class PaintingApp {

    public static void main(String[] args) {
        new PaintingApp().run();
    }

    private void run() {
        Injector injector = Guice.createInjector(new DIConfig());
        Artist artist = injector.getInstance(Artist.class);
        System.out.println(artist.createArt("Hello World!"));
    }

}