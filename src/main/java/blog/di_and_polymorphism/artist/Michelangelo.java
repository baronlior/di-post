package blog.di_and_polymorphism.artist;

import blog.di_and_polymorphism.painter.Painter;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Michelangelo implements Artist {

    private Painter pedantDelegate;
    private Painter lazyDelegate;

    @Inject
    public Michelangelo(@Named("renaissance") Painter renaissancePainter,
                        @Named("pop-art") Painter popArt){
        this.pedantDelegate = renaissancePainter;
        this.lazyDelegate = popArt;
    }

    public String createArt(String vision) {
        return pedantDelegate.paint(vision) + "\n" +
                lazyDelegate.paint(vision) + "  - by Michelangelo";
    }
}

