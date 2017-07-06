package cw19;


public class MyColl<T extends Object> {
    
    private T value;
    
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
