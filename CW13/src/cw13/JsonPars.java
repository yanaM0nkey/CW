package cw13;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonPars {

   
    public static void main(String[] args) {
        //Root root = parseJson("test.json");
        Root root = parseGson("test.json");
        System.out.println(root.toString());
        
        
    }
    public static Root parseJson(String path){
        JSONParser parser = new JSONParser();
        Root root = null;
        
        try{
            JSONObject rootObj = (JSONObject)parser.parse(new FileReader(path));
            root = new Root();
            String name = (String)rootObj.get("name");
            System.out.println("name = " + name);
            root.setName(name);
            
            ArrayList<People> peopleList = new ArrayList<>();
            JSONArray peopleArray = (JSONArray)rootObj.get("people");
            for(Object item: peopleArray){
                JSONObject itemObj = (JSONObject)item;
                People people = new People();
                long id = (long)itemObj.get("id");
                String namePeople = (String)itemObj.get("name");
                String surname = (String)itemObj.get("surname");
                long age = (long)itemObj.get("age");
                boolean isDegree = (boolean)itemObj.get("isDegree");
                people.setId((int)id);
                people.setAge((int)age);
                people.setIsDegree(isDegree);
                people.setName(namePeople);
                people.setSurname(surname);
                peopleList.add(people); 
                System.out.println(people.toString());
            }
            root.setPeople(peopleList);
            
            
            
        } catch(Exception e){
            System.out.println("Ошибка чтения json файла" + e.getMessage());
        }
        return root;
    }
    
    public static Root parseGson(String path){
        Root root = null;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            root = gson.fromJson(reader, Root.class);
            
        } catch(Exception e){
            System.out.println("Ошибка чтения json файла" + e.toString());
        }
        
        
        
        return root;
    }

    
    
}

