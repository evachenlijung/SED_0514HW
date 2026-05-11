public class SpamBox extends EmailBox{
    public SpamBox(){
        super();
    }

    @Override
    public boolean canHandle(Email email){
        return email instanceof Spam;
    }
}
