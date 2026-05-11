public class TransientWindow extends Window{

    public TransientWindow(WindowDisplayer displayer){
        super(displayer);
    }

    public void drawCloseBox(){
        drawRectangle();
    }
}