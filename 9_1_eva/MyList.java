import java.util.*;

public class MyList{
    private String name;
    private List<Object> objects;
    public int length;

    public MyList(String name){
        this.name = name;
        objects = new ArrayList<>();
        this.length = 0;
    }

    public String getName(){
        return name;
    }

    public void add(Object o){
        objects.add(o);
        this.length++;
    }

    public Object get(int index){
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
        return objects.get(index);
    }

    // public void printAll(){
    //     for(Object o : objects){
    //         System.out.println(o);
    //     }
    // }

    public void printAll(){
        MyIterator<Object> it = new MyIterator<>(this.objects);
        it.printAll();
    }
}
