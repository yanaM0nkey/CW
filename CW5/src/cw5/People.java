package cw5;


public abstract class People {//по умолчанию наследуется от Object(для всех объектов)
    private String name;
    private int age;
    
    
    public abstract void myTest();

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
    }
}
