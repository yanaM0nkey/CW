package singletone;


public class View {
     public static void main(String[] args) {
         Controller controller = Controller.getInstance();
         //���� ����� ��� ���� ������
         Controller controller2 = Controller.getInstance(); // ���� � ��� �� ������
         
     }
    
}
