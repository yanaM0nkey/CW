package thread;


public class Main implements Runnable{

   
    private static Runnable run = new Runnable(){
        @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("thread1 = " + i);
                }
            }
        }; 
    public static void main(String[] args) {
        
        Thread thread = new Thread(run); /*(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("thread1 = " + i);
                }
            }
        });*/
        
        Thread thread2 = new Thread(new Main());
        thread.start();
       
        
        
        
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("thread1 = " + i);
        }
    }
    
    
    
}
