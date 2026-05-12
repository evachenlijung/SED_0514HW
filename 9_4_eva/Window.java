public class Window{
    private WindowDisplayer displayer;

    public Window(){
    }

    public void setDisplsyer(WindowDisplayer displayer){
        this.displayer = displayer;
    }

    public void drawText(){
        displayer.drawText();
    }

    public void drawRectangle(){
        displayer.drawRectangle();
    }

    public void drawBorder(){}

    public void drawCloseBox(){}
}