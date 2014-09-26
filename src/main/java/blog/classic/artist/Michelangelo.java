package blog.classic.artist;

import blog.classic.painter.Painter;
import blog.classic.painter.PainterA;


public class Michelangelo implements Artist {

    private Painter delegate;

    public Michelangelo(){
        this.delegate = new PainterA();
    }

    public String createArt(String vision) {
        return delegate.paint(vision) + "  - by Michelangelo";
    }
}


