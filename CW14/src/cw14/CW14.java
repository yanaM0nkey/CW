package cw14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CW14 {

    
    public static void main(String[] args) {
        String text = "+375(29)1234567";
        Pattern p = Pattern.compile("\\+375\\(?(17|29|44|33|25)\\)?\\d{7}$");
        Matcher m = p.matcher(text);
        
        if(m.matches()){
            System.out.println("Номер верный");
        } else{
            System.out.println("Номер неверный");
        }
        
        String text2 = "skfjn;akfn sfkj@gmail.com slkfmlk slkmf smlfm@gmail.com nskfjn snkjdnf@gmail.com";
        text.replace(text, text);
        
    }
    
}
