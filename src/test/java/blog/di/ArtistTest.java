package blog.di;

import blog.di.artist.Michelangelo;
import blog.di.artist.Artist;
import blog.di.painter.Painter;
import com.google.inject.*;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArtistTest {

    private Painter mockPainter;

    @Inject
    Artist uut; // unit under test

    @Before
    public void setUp() {
        mockPainter = new Painter() {
            @Override
            public String paint(String subject) {
                return "[" + subject + "]";
            }
        };
        Guice.createInjector(getTestModule()).injectMembers(this);
    }

    private Module getTestModule() {
        return new AbstractModule() {
            @Override protected void configure() {
                bind(Painter.class).toInstance(mockPainter);
                bind(Artist.class).to(Michelangelo.class);
            }
        };
    }

    @Test
    public void testArtCreation() {
        Assert.assertEquals(
                uut.createArt("Yo!"),
                "[Yo!]  - by Michelangelo"
        );
    }
}


