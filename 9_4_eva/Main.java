import java.io.*;

public class Main{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Usage: java Main <input_file>");
            return;
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            Window w = null;
            while((line = reader.readLine()) != null){
                String[] ss = line.trim().split("\\s+");
                switch(ss[0]){
                    case "window" -> {
                        if(ss[1].equals("IconWindow")) w = new IconWindow();
                        else if(ss[1].equals("TransientWindow")) w = new TransientWindow();

                        WindowDisplayer displayer = null;
                        if(ss[2].equals("XWindow")) displayer = new XWindow();
                        else if(ss[2].equals("PMWindow")) displayer = new PMWindow();

                        if(w != null && displayer != null){
                            w.setDisplsyer(displayer);
                        }
                    }
                    case "drawBorder" -> {w.drawBorder(); }
                    case "drawCloseBox" -> {w.drawCloseBox(); }
                    default -> {}
                }
            }
            reader.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}