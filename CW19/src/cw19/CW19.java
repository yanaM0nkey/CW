package cw19;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;


public class CW19 {

    private String b = "njkc";
    
    public static void main(String[] args) {
       MyColl<String> m = new MyColl<>();
       
       
       ArrayList<? extends Number> list = new ArrayList<Integer>();
       //list = new ArrayList<String>(); потому что наследуемся от Number
       ArrayList<? super Integer> list2 = new ArrayList<Integer>();
       list2 = new ArrayList<Number>();
       
     
       
        
    }

    void test(){
       SoftReference<String> ref = new SoftReference<>(b);//могут быть уничтожены при переполнении памяти, лучше использовать для кэшированных данных
       String a = ref.get();
       if( a != null){
           //использовать
       }
       
       WeakReference<String> ref2 = new WeakReference<>(b);//могут быть уничтожены если нет сильных ссылок 
       PhantomReference<String> ref3 = new PhantomReference<>(b);//сразу попадает в очистку
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); 
    }
    
}
