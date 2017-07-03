package thread;



public class Main2 {
    public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start();
   // thread.interrupt();

    //thread.setName("aaa");
    //thread.getName();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            
        }
       thread.interrupt(); 
    }
    }
