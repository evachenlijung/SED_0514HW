public class TeX implements TextFormat{
    public TeX(){}

    @Override
    public String display(String tokens){
        StringBuilder sb = new StringBuilder();
        for(char c : tokens.toCharArray()){
            switch(c){
                case 'C' -> {sb.append('c'); }
                case 'F' -> {sb.append('_'); }
                case 'P' -> {sb.append('|'); }
                default -> {}
            }
        }
        return sb.toString();
    }
}
