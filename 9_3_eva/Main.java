import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Usage: java MAin <input_file>");
        }
        try{
            List<Email> emails = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            while((line = reader.readLine()) != null){
                line = line.trim();
                switch(line){
                    case "SPAM" -> {emails.add(new Spam()); }
                    case "COMPLAINT" -> {emails.add(new Complaint()); }
                    case "FAN" -> {emails.add(new FanMail()); }
                    default -> {}
                }
            }
            reader.close();

            EmailHandler handler = new EmailHandler();
            boolean first = true;
            for(Email email : emails){
                // handler.handle(email);
                if(!first) System.out.println();
                else first = false;
                handler.handle(email);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}