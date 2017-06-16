package exception;


public class NewClass {
     public static void main(String[] args) {
        
        NewClass m = new NewClass();
        try{
        m.mm();
        }
        catch(MyEx ex){
            System.err.println("code error " + ex.getCode());
        }
    }
    public void mm() throws MyEx{
       int a=0;
        System.out.println("Method mm");
       if(a==5){
            throw new MyEx(150);
        }
    }
    
}
