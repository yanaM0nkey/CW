package abstractFactory;

public class Main {
    public static void main(String[] arg){
        Database database = null;
        if(true){//<ÅÑËÈ ÍÓÆÍÎ ÈÑÏÎËÜÇÎÂÀÒÜ SQL LITE>
            MyFabrica fabrica = new SQLiteFabrica();
            database = fabrica.getDatabase();
            
        }else{//<ÅÑËÈ ÍÓÆÍÎ ÈÑÏÎËÜÇÎÂÀÒÜ MS LITE>
            MyFabrica fabrica = new MSFabrica();
            database = fabrica.getDatabase();
        }
        
        //äàëüøå íàì íå âàæíî ñ êàêîé áàçîé ìû ğàáîòàåì
        database.open();
        database.getList();
    }    
}
