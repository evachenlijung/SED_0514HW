import java.util.*;

public class Group extends Component{
    private List<Component> components;

    public Group(){
        this.components = new ArrayList<>();
    }

    public void add(Component c){
        components.add(c);
    }

    public String toString(){
        if(components.size() == 0) return "Group:{} ";
        StringBuilder sb = new StringBuilder(); 
        sb.append("Group:{");
        for(Component c : components){
            sb.append(c.toString());
        }
        sb.append("} ");
        return sb.toString();
    }
}