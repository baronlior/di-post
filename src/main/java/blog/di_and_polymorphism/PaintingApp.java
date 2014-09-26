package blog.di_and_polymorphism;

import blog.di_and_polymorphism.artist.Artist;
import com.google.inject.Guice;
import com.google.inject.Injector;

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