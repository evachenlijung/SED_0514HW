public class CEO extends EmailBox{
    public CEO(){
        super();
    }

    @Override
    public boolean canHandle(Email email){
        return email instanceof FanMail;
    }
}
