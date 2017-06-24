//������� singletone
package singletone;


public class Controller {
    private static Controller controller;
    // private static Controller controller = new Controller();
    //� ����� getInstance() ����� ������ ���������� controller

    private Controller() {
    }
    
    public static Controller getInstance(){
        if(controller == null){//������� ����� ��������� �� ���� � ��� �� ������ 
            controller = new Controller();
        }
        return controller;
        
    }
    
}
