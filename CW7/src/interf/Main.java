package interf;


public class Main implements OnClickListener {
    
    public static void main(String[] args){
        
        Main main = new Main();
        Button button = new Button();
        
        //уведомление о нажати кнопки делается через интерфейс
        button.setListener(main);
        button.onTouch();//в реальной программе это реализуется само
        
        
        
    } 

    @Override
    public void onClick() {
        System.out.println("onClick() in Main");
        
    }
}
