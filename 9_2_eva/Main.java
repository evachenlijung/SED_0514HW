import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Usage: java Main <input_file>");
            return;
        }
        try{
            List<Component> components = new ArrayList<>();
            Stack<Pair> stack = new Stack<>();

            String xml = "<?xml version=\"1.0\"?>";
            String question = "<Question>";

            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            // StringBuilder sb = new StringBuilder();
            String line;

            if((line = reader.readLine()) != null && !xml.equals(line.trim())){
                reader.close();
                throw new Exception("Input file format should be XML.\n");
            }               
            if((line = reader.readLine()) != null && !question.equals(line.trim())){
                reader.close();
                throw new Exception("Next to <xml> tag should be <Question>.\n");
            }  

            while((line = reader.readLine()) != null ){
                String tag = line.trim();
                int n_tab = 0;
                for(char c : line.toCharArray()){
                    if(c == '\t') n_tab++;
                }
                if(tag.equals("<Group>")){
                    stack.push(new Pair(n_tab, new Group()));
                }else if(tag.equals("</Group>")){
                    Group g = (Group)stack.pop().component();
                    if(stack.empty()) components.add(g);
                    else ((Group)stack.peek().component()).add(g);
                }else if(tag.equals("<Line/>") || tag.equals("<Text/>") || tag.equals("<Rectangle/>") || tag.equals("<Group/>")){
                    String name = tag.replace("<", "").replace("/>", "");
                    Component c = new Component().createComponent(name);
                    if(stack.isEmpty()){
                        components.add(c);
                    }else if(stack.peek().component() instanceof Group){
                        ((Group)stack.peek().component()).add(c);
                    }
                }
            }
            reader.close();

            for(Component c : components){
                System.out.println(c);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}