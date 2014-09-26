package blog.classic.painter;


public class PainterA implements Painter {

    public String paint(String subject) {

        return decorate(subject);
    }

    private String decorate(String content) {

        return "~~ " + content + " ~~";
    }

}


