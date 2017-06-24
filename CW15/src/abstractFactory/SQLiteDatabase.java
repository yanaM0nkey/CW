package abstractFactory;


public class SQLiteDatabase implements Database{

    @Override
    public void open() {
        //тут пишем специфичный код для конкретной базы данных
    }

    @Override
    public void getList() {
    }
    
}
