package builder;


public class Student {
    private String name;
    private int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    

    public String getName() {
        return name;
    }

    

    public int getAge() {
        return age;
    }

    public static class Builder{
        
        private String name;
        private int age;
        
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        
        public Student build() throws Exception{
            if(age == 0){
                throw new Exception("age == 0");
            }
            if(name.isEmpty()){
                throw new Exception("name is empty()");
            }
            return new Student(name,age);
        }
        
    }
    
}
