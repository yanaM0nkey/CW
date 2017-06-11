package date;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    
    public static void main(String[] arg){
        
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat();
        sf.applyPattern("MMM");
        String dateString = sf.format(date);
        System.out.println(dateString);       
    }
}
