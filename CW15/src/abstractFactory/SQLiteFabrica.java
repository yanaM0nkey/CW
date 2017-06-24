package abstractFactory;

public class SQLiteFabrica implements MyFabrica{

    @Override
    public Database getDatabase() {
        SQLiteDatabase database = new SQLiteDatabase();
        //делает нужные вызовы в database и все что нужно для инициализации
        database.open();
        return database;
    }
    
}
