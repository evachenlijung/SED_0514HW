public class Reader{
    private TextFormat textformat;
    private String tokens;
    
    public Reader(TextFormat textformat, String tokens){
        this.textformat = textformat;
        this.tokens = tokens;
    }

    public void setTextFormat(TextFormat textformat){
        this.textformat = textformat;
    }

    public String convert(String tokens){
        return textformat.display(tokens);
    }
}
