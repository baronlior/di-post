package blog.di.painter;


public class PainterA implements blog.di.painter.Painter {

    public String paint(String subject) {

        return decorate(subject);
    }

    private String decorate(String content) {

        return "~~ " + content + " ~~";
    }

}


