package cw11;


public class Student implements Comparable<Student>{
    private String name;
    private int age;

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student2) {
        //должен возвращать три значения
        if(name.equals(student2.getName())){
            return 0;
        }
        return name.compareTo(student2.getName());
       
    }
    
    

    
}
