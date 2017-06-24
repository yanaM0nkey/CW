package builder;


public class Main {
    public static void main(String[] args) {
       // Student.Builder builder = new Student.Builder().setName("nldf").setAge(0);
       
       
       // Student.Builder builder = new Student.Builder();
       //builder.setNmae("nvdk");
       //builder.setAge(0);
        
        try {
            Student st  = new Student.Builder().setName("nldf").setAge(0).build();
        } catch (Exception ex) {
            
        }
        
    }
    
}
