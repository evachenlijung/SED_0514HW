import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Usage: java Main <input_file>");
            return;
        }
        try{                            
            Map<String, MyList> lists = new LinkedHashMap<>();
            Map<String, SkipList> skiplists = new LinkedHashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            while((line = reader.readLine()) != null){
                String[] ss = line.split("\\s+");
                switch(ss[0]){
                    case "Create" -> {
                        switch(ss[2]){
                            case "List" -> {lists.put(ss[1], new MyArray(ss[1])); }
                            case "SkipList" -> {skiplists.put(ss[1], new SkipList(ss[1])); }
                            default -> {}
                        }
                    }
                    case "Add" -> {
                        if(lists.containsKey(ss[1])){
                            lists.get(ss[1]).add(ss[2]);
                        }else if(skiplists.containsKey(ss[1])){
                            skiplists.get(ss[1]).add(new SkipNode(ss[2]));
                        }
                    }
                    case "Length" -> {
                        if(lists.containsKey(ss[1])){
                            System.out.println(lists.get(ss[1]).length);
                        }else if(skiplists.containsKey(ss[1])){
                            System.out.println("SkipList can not access length");
                        }
                    }
                    case "Size" -> {
                        if(lists.containsKey(ss[1])){
                            System.out.println("List do not have method size");
                        }else if(skiplists.containsKey(ss[1])){
                            System.out.println(skiplists.get(ss[1]).size());
                        }
                    }
                    case "Get" -> {
                        if(lists.containsKey(ss[1])){
                            System.out.println(lists.get(ss[1]).get(Integer.parseInt(ss[2])));
                        }else if(skiplists.containsKey(ss[1])){
                            System.out.println("SkipList do not have method get");
                        }
                    }
                    case "GetNode" -> {
                        if(lists.containsKey(ss[1])){
                            System.out.println("List do not have method getNode");
                        }else if(skiplists.containsKey(ss[1])){
                            System.out.println(skiplists.get(ss[1]).getNode(Integer.parseInt(ss[2])));
                        }
                    }
                    case "PrintOutList" -> {
                        if(lists.containsKey(ss[1])){
                            lists.get(ss[1]).printAll();
                        }else if(skiplists.containsKey(ss[1])){
                            skiplists.get(ss[1]).printAll();
                        }
                    }
                    default -> {}
                }
            }
            reader.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}