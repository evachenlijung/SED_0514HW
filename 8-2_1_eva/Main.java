import java.io.*;

public class Main{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Usage: java Main <input_file>");
            return;
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;
            while((line = br.readLine()) != null){
                TextFormat textformat = null;
                switch(line){
                    case "TeX" -> {textformat = new TeX(); }
                    case "TextWidget" -> {textformat = new TextWidget(); }
                    default -> {}
                }
                line = br.readLine();
                if(textformat == null){
                    continue;
                }
                Reader reader = new Reader(textformat, line);
                System.out.println(reader.convert(line));
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }
    } 
}
