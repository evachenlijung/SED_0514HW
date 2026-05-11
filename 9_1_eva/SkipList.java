import java.util.*;

public class SkipList{
    private String name;
    private List<SkipNode> nodes;

    public SkipList(String name){
        this.name = name;
        nodes = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void add(SkipNode node){
        nodes.add(node);
    }

    public int size(){
        return nodes.size();
    }

    public SkipNode getNode(int index){
        if(index < 0 || index >= nodes.size()){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + nodes.size());
        }
        return nodes.get(index);
    }

    // public void printAll(){
    //     for(SkipNode n : nodes){
    //         System.out.println(n);
    //     }
    // }

    public void printAll(){
        MyIterator<SkipNode> it = new MyIterator<>(this.nodes);
        it.printAll();
    }
}
