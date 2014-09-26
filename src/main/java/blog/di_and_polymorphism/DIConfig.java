package blog.di_and_polymorphism;

import blog.di_and_polymorphism.artist.Artist;
import blog.di_and_polymorphism.artist.Michelangelo;
import blog.di_and_polymorphism.painter.Painter;
import blog.di_and_polymorphism.painter.PainterA;
import blog.di_and_polymorphism.painter.PainterB;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class DIConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(Painter.class)
                .annotatedWith(Names.named("renaissance"))
                .to(PainterA.class);
        bind(Painter.class)
                .annotatedWith(Names.named("pop-art"))
                .to(PainterB.class);
        bind(Artist.class).to(Michelangelo.class);
    }

}


