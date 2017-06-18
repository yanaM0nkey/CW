package cw12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    private static final String LINK = "https://www.dropbox.com/s/71qlrpwlhduf9va/test.xml?dl=0";
    

    public static void main(String[] args) {
        
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        
        try {
            //открываем соединение
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection = 
                    (HttpURLConnection)url.openConnection();
            //получаем код ответа от сайта или сервера
            int responseCode = httpURLConnection.getResponseCode();
            //провер€ем успешное ли подключение т.е. проверка на ошибки
            if(responseCode == HttpURLConnection.HTTP_OK){
               inputStream = httpURLConnection.getInputStream();
               File file = new File("test.xml");
               outputStream = new FileOutputStream(file);
               byte[] buffer = new byte[1024]; // то что мы скачиваем т.е. полезна€ информаци€
               int bytesRead = -1; //количество прочитанных байт за одно чтение read()
               while((bytesRead = inputStream.read(buffer)) != -1 ){
                   //записываем в файл байтф от 0 до "bytesRead" из массива buffer
                   outputStream.write(buffer, 0, bytesRead);
                   
               }
            } else{
                System.out.println("responseCode = " + responseCode);
            }
            
        } catch (Exception ex) {
            System.out.println("ќшибка" + ex.toString());
        } finally {
            try{
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream != null){
                    outputStream.close();
                }
            }catch(Exception e){
                System.out.println("ќЎибка при закрыти€ стрима" + e.toString());
            }
        }
        
    }
    
}
