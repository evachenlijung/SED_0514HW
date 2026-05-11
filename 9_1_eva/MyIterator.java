import java.util.*;

public class MyIterator<E>{
    private List<E> elements;
    
    public MyIterator(List<E> elements){
        this.elements = elements;
    }

    public void printAll(){
        for(E e : elements){
            System.out.println(e);
        }
    }
}