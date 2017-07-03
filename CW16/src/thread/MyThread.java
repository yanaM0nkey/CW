package thread;




public class MyThread extends Thread{

    @Override
    public void run() {
        
        for(int i = 0; i < 2; i++){
            
            if(isInterrupted()){
                System.out.println("mythread stop 1");
                return;
               
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("mythread stop 2");
                return;
                
            }
            System.out.println("myThread " + i);
        }
    }
    
    
    
    
}
