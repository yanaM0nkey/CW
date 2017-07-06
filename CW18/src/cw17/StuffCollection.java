package cw17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StuffCollection<T> {
    private HashMap<String,List<T>> data = new HashMap<>();
 
    private T director;
    
    public void addDirector(T value){

    director = value;

}

public T getDirector(){
    return director;
}

public void add(String department, T value){
    if(data.containsKey(department)){
        data.get(department).add(value);       
    }else{
        List<T> list = data.get(department);
        if(list==null){
            list = new ArrayList<>();
        }
        list.add(value);
        data.put(department, list);
    }
   }
}
