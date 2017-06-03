
package newpackage;


public class Main {
    public static void main(String[] args) {
    
        Car red = new RedCar();
        Car blue = new BlueCar();
        printColor(red);
        printColor(blue);
    }
    public static void printColor(Car car){
        
        if(car instanceof RedCar){ 
            RedCar car2 = (RedCar)car; // приведение типа к RedCar
            car2.test();
        }
            
            
        System.out.println(car.GetColor());
        
        
    }
}
