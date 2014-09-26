package blog.di;

import blog.di.artist.Artist;
import blog.di.artist.Michelangelo;
import blog.di.painter.Painter;
import blog.di.painter.PainterA;
import com.google.inject.*;

public class DIConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(Painter.class).to(PainterA.class);
        bind(Artist.class).to(Michelangelo.class);
    }

}


