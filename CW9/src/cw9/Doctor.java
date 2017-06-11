package cw9;


public class Doctor {

    private int a = 1;
    private static int b = 5;
    
    public void testInnerClass(){
        Inner in = new Inner();
        in.test();
    }
    
    public static class Inner {
        private int in = 10;
        
        
        private void test(){
            
           // int b1 = a + Doctor.b;
       } 
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
