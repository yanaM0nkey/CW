package cw17;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

  
    public static void main(String[] args) {
        StuffCollection<PvtPeople> stuff = new StuffCollection<>();
        test("AAA", String.class);
    }
    
    
    public static <T extends Object> T test(String text, T t){
        T obj = null;
        try {
            obj = (T) t.getClass().newInstance();
        } catch (Exception ex) {
        }
     
        return obj;
    }
    
}
