package abstractFactory;

public class SQLiteFabrica implements MyFabrica{

    @Override
    public Database getDatabase() {
        SQLiteDatabase database = new SQLiteDatabase();
        //������ ������ ������ � database � ��� ��� ����� ��� �������������
        database.open();
        return database;
    }
    
}
