public class Window{
    private WindowDisplayer displayer;

    public Window(WindowDisplayer displayer){
        this.displayer = displayer;
    }

    public void drawText(){
        displayer.drawText();
    }

    public void drawRectangle(){
        displayer.drawRectangle();
    }
}