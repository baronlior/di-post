package blog.classic;

import blog.classic.artist.Michelangelo;

public class ServiceLocator {

    public static Object create(String name) {
        return new Michelangelo();
    }
}
