package cw17;

import java.util.ArrayList;

public class StuffCollection<T extends People> {
    private ArrayList<T> list = new ArrayList<>();
    
    public void add(T value, String nameDepartment){
        list.add(value);
        
    }
    
    public void addDepartment(String nameDepartment){
      
        
    }
    
    public void addDirector(T value){
        
    }
    
    public T getDirector(){
        
    }
    public void remove(T value, String nameDepartment){
        list.remove(value);
        
    }
    
    public void removeAllDepartment(String nameDepartment){
        
    }
    
    public List<T> getAllStuff(){
        
    }
}
