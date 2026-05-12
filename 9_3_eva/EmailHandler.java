import java.util.*;

public class EmailHandler{
    private List<EmailBox> eboxes;

    public EmailHandler(){
        eboxes = new ArrayList<>();
        eboxes.add(new SpamBox());
        eboxes.add(new LegalDept());
        eboxes.add(new CEO());
    }

    public List<EmailBox> getEboxes(){
        return eboxes;
    }

    // public void handle(Email email){
    //     for(EmailBox box : eboxes){
    //         if(box.canHandle(email)){
    //             box.addEmail(email);
    //             if(box instanceof SpamBox) System.out.println("Put mail to the spam box.");
    //             else if(box instanceof LegalDept) System.out.println("Forward to legal department.");
    //             else if(box instanceof CEO) System.out.println("Forward to CEO.");
    //             break;
    //         }
    //     }
    // }

    public void handle(Email email){
        for(EmailBox box : eboxes){
            if(box.canHandle(email)){
                box.addEmail(email);
                if(box instanceof SpamBox) System.out.print("Put mail to the spam box.");
                else if(box instanceof LegalDept) System.out.print("Forward to legal department.");
                else if(box instanceof CEO) System.out.print("Forward to CEO.");
                break;
            }
        }
    }
}
