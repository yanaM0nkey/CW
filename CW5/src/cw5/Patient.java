package cw5;

import java.util.Objects;


public class Patient extends People {
    
    //свойства
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override//переопределение
    public String toString() {
        return "Patient{" + "id=" + id + '}';
    }
    
    
    public Patient(String name, int age){     //конструктор, который вызывается во время создания объекта
        System.out.println("bkjvbl");
        //this.name = name;
        //this.age = age;
    }
    
    public Patient(){     //конструктор по умолчанию
        
    }

    /*@Override
    public boolean equals(Object obj) {
        Patient pac  = (Patient)obj;
        return id == pac.id; 
    }*/

   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) {//сравнивает ссылки
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {//сравнивает типы, относится ли объект к тому же классу
            return false;
        }
        final Patient other = (Patient) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + this.age;
        return hash;
    }
    
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
    
   
}
