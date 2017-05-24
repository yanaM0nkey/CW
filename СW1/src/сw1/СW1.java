package сw1;

public class СW1 {

    public static void main(String[] args) {
    int[] a = {1,5,5,7,5,4,5};
    /*for(int i=0; i<a.length; i++){
        a[i]=a[i]+5;
        System.out.println("index " + i + "= " + a[i]);
         }*/
    int i = 0;
    do{
       System.out.println("index " + i + " = " + a[i]); 
       i++;
    }while (i<a.length);
    
    int b = 0;
    double sum = 0;
    while(b<a.length){
        sum += a[b];
        b++;
    }
    sum = sum/a.length;
    System.out.println(sum);
    }
    
}
