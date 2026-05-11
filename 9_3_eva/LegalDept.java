public class LegalDept extends EmailBox{
    public LegalDept(){
        super();
    }

    @Override
    public boolean canHandle(Email email){
        return email instanceof Complaint;
    }
}