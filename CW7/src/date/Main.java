
package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Main {
    
    public static void main(String[] arg){
        
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat();
        sf.applyPattern("MMM");
        String dateString = sf.format(date);
        System.out.println(dateString);
        
        System.out.println(date.getTime());
        
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        System.out.println(cal.get(GregorianCalendar.DATE));
        System.out.println(cal.get(GregorianCalendar.MONTH));
        System.out.println(cal.get(GregorianCalendar.YEAR));
        
        cal.add(GregorianCalendar.DATE, 45);
        System.out.println(cal.get(GregorianCalendar.DATE));
        System.out.println(cal.get(GregorianCalendar.MONTH));
        System.out.println(cal.get(GregorianCalendar.YEAR));
        
        
        
    }
}
