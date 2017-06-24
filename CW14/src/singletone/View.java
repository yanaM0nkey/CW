package singletone;


public class View {
     public static void main(String[] args) {
         Controller controller = Controller.getInstance();
         //хочу чтобы был один объект
         Controller controller2 = Controller.getInstance(); // один и тот же объект
         
     }
    
}
