//паттерн singletone
package singletone;


public class Controller {
    private static Controller controller;
    // private static Controller controller = new Controller();
    //и тогда getInstance() будет только возвращает controller

    private Controller() {
    }
    
    public static Controller getInstance(){
        if(controller == null){//сделали чтобы ссылалось на один и тот же объект 
            controller = new Controller();
        }
        return controller;
        
    }
    
}
