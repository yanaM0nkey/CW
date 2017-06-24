package abstractFactory;

public class Main {
    public static void main(String[] arg){
        Database database = null;
        if(true){//<���� ����� ������������ SQL LITE>
            MyFabrica fabrica = new SQLiteFabrica();
            database = fabrica.getDatabase();
            
        }else{//<���� ����� ������������ MS LITE>
            MyFabrica fabrica = new MSFabrica();
            database = fabrica.getDatabase();
        }
        
        //������ ��� �� ����� � ����� ����� �� ��������
        database.open();
        database.getList();
    }    
}
