package abstractFactory;

public class MSFabrica implements MyFabrica{

    @Override
    public Database getDatabase() {
        MSDatabase database = new MSDatabase();
        //делает нужные вызовы в database и все что нужно для инициализации
        database.open();
        return database;
    }
    
}
