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
            //��������� ����������
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection = 
                    (HttpURLConnection)url.openConnection();
            //�������� ��� ������ �� ����� ��� �������
            int responseCode = httpURLConnection.getResponseCode();
            //��������� �������� �� ����������� �.�. �������� �� ������
            if(responseCode == HttpURLConnection.HTTP_OK){
               inputStream = httpURLConnection.getInputStream();
               File file = new File("test.xml");
               outputStream = new FileOutputStream(file);
               byte[] buffer = new byte[1024]; // �� ��� �� ��������� �.�. �������� ����������
               int bytesRead = -1; //���������� ����������� ���� �� ���� ������ read()
               while((bytesRead = inputStream.read(buffer)) != -1 ){
                   //���������� � ���� ����� �� 0 �� "bytesRead" �� ������� buffer
                   outputStream.write(buffer, 0, bytesRead);
                   
               }
            } else{
                System.out.println("responseCode = " + responseCode);
            }
            
        } catch (Exception ex) {
            System.out.println("������" + ex.toString());
        } finally {
            try{
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream != null){
                    outputStream.close();
                }
            }catch(Exception e){
                System.out.println("������ ��� �������� ������" + e.toString());
            }
        }
        
    }
    
}
