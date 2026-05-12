import java.lang.Class;

public class Component{
    public Component(){

    }

    public Component createComponent(String name){
        switch(name){
            case "Line" -> {return new Line(); }
            case "Text" -> {return new Text(); }
            case "Rectangle" -> {return new Rectangle(); }
            case "Group" -> {return new Group(); }
            default -> {return null; }
        }
    }

    public String toString(){
        return this.getClass().getName() + " ";
    }
}