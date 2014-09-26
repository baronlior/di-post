package blog.di.artist;

import blog.di.painter.Painter;
import com.google.inject.Inject;

public class Michelangelo implements Artist {

    private Painter delegate;

    @Inject
    public Michelangelo(Painter painter){
        this.delegate = painter;
    }

    public String createArt(String vision) {
        return delegate.paint(vision) + "  - by Michelangelo";
    }
}

