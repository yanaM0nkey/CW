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
       //list = new ArrayList<String>(); ������ ��� ����������� �� Number
       ArrayList<? super Integer> list2 = new ArrayList<Integer>();
       list2 = new ArrayList<Number>();
       
     
       
        
    }

    void test(){
       SoftReference<String> ref = new SoftReference<>(b);//����� ���� ���������� ��� ������������ ������, ����� ������������ ��� ������������ ������
       String a = ref.get();
       if( a != null){
           //������������
       }
       
       WeakReference<String> ref2 = new WeakReference<>(b);//����� ���� ���������� ���� ��� ������� ������ 
       PhantomReference<String> ref3 = new PhantomReference<>(b);//����� �������� � �������
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); 
    }
    
}
