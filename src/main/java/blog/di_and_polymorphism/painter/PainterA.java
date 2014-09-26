package blog.di_and_polymorphism.painter;


public class PainterA implements Painter {

    public String paint(String subject) {

        return decorate(subject);
    }

    private String decorate(String content) {

        return "~~ " + content + " ~~";
    }

}


