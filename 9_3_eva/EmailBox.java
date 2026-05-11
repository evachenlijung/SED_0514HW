import java.util.*;

public class EmailBox{
    private List<Email> emails;

    public EmailBox(){
        this.emails = new ArrayList<>();
    }

    public boolean canHandle(Email email){
        return false;
    }

    public void addEmail(Email email){
        this.emails.add(email);
    }
}