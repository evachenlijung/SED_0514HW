public class TextWidget implements TextFormat{
    public TextWidget(){

    }
    
    @Override
    public String display(String tokens){
        StringBuilder sb = new StringBuilder();
        for(char c : tokens.toCharArray()){
            switch(c){
                case 'C' -> {sb.append("<Char>"); }
                case 'F' -> {sb.append("<Font>"); }
                case 'P' -> {sb.append("<Paragraph>"); }
                default -> {}
            }
        }
        return sb.toString();
    }
}
