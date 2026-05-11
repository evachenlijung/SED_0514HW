public class IconWindow extends Window{

    public IconWindow(WindowDisplayer displayer){
        super(displayer);
    }

    public void drawBorder(){
        drawText();
        drawRectangle();
    }
}