package blog.di.artist;

import blog.di.painter.Painter;
import com.google.inject.Inject;


/**
 * Illustrate injection to private member
 */
public class Michelangelo2 implements Artist {

    @Inject
    private Painter delegate;

    public Michelangelo2(){
    }

    public String createArt(String vision) {
        return delegate.paint(vision) + "  - by Michelangelo";
    }
}

