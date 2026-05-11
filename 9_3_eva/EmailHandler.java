import java.util.*;

public class EmailHandler{
    private List<EmailBox> emailBoxes;

    public EmailHandler(){
        emailBoxes = new ArrayList<>();
        emailBoxes.add(new SpamBox());
        emailBoxes.add(new LegalDept());
        emailBoxes.add(new CEO());
    }

    public void handle(Email email){
        for(EmailBox box : emailBoxes){
            if(box.canHandle(email)){
                box.addEmail(email);
                break;
            }
        }
    }
}
