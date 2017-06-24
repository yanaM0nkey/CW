package abstractFactory;

public class MSFabrica implements MyFabrica{

    @Override
    public Database getDatabase() {
        MSDatabase database = new MSDatabase();
        //������ ������ ������ � database � ��� ��� ����� ��� �������������
        database.open();
        return database;
    }
    
}
