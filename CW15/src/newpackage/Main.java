package newpackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){
        int N = 5;
        if(N < 1 || N >= 100){
           System.exit(0);
        }
        if(N%2 == 0){
            System.exit(0);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(0);
        
        //int res = 0;
        //for(){
        //res = res ^a[i];
        if(list.size() == 1){
            vyvod(list);

        }else{
            for(int i = 0; i < list.size(); i++){
                for(int j = i+1; j < list.size(); j++){
                   if(list.get(i) == list.get(j)){
                       ArrayList <Integer> a = new ArrayList<>();
                        a.add(list.get(j));
                        list.removeAll(a);
                        a.clear();
                        j--;
                        i=0;
                        
                    } 
                }

            }
            vyvod(list);
        }
    }
    
    public static void vyvod(ArrayList<Integer> list){
        for(Integer text: list){
            System.out.print(text + " ");
        }
        System.out.println();
    }
    
}
