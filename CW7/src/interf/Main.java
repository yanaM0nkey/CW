package interf;


public class Main implements OnClickListener {
    
    public static void main(String[] args){
        
        Main main = new Main();
        Button button = new Button();
        
        //����������� � ������ ������ �������� ����� ���������
        button.setListener(main);
        button.onTouch();//� �������� ��������� ��� ����������� ����
        
        
        
    } 

    @Override
    public void onClick() {
        System.out.println("onClick() in Main");
        
    }
}
