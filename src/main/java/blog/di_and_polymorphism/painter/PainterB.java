package blog.di_and_polymorphism.painter;

public class PainterB implements Painter {

    public String paint(String subject) {

        return emphasize(subject);
    }

    private String emphasize(String content) {

        return "< " + content.toUpperCase() + " >";
    }
}
