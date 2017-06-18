package cw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;


public class CW11 {

   
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        
        System.out.println(list.toString());
        System.out.println("Размер массива " + list.size());
        
        System.out.println("Элемент номер 3 " + list.get(2));
        
        for(String text: list){
            System.out.println(text);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(10);
        list2.add(5);
        list2.add(7);
        list2.add(10);
        list2.add(5);
        list2.add(7);
        System.out.println(list2.toString());
        
       //нельзя изменять массив внутри for в коллекции, нужно использовать обычный
        for(int i = 0; i < list2.size(); i++){
            if(list2.get(i) == 5){
                list2.remove(i);
            }
        }
        System.out.println(list2.toString());
        
        ArrayList <Integer> a= new ArrayList<Integer>();
        a.add(7);
        list2.removeAll(a);
        System.out.println(list2.toString());
        
        LinkedList <Integer> b= new LinkedList<Integer>();
        
        HashMap<Integer, String> hash = new HashMap<>();
        
        hash.put(5,"Пять");
        hash.put(7,"Семь");
        hash.put(10,"Десять");
        hash.put(20,"Двадцать");
        System.out.println(hash.toString());
        System.out.println(hash.get(10));
        
        for(Integer key: hash.keySet()){
            System.out.println("Key = " + key + " value = " + hash.get(key));
        }
        //сортированный в отличии от HashMap 
        TreeMap<Integer, String> tree = new TreeMap<>();
        
        HashMap<Country, Student> hash2 = new HashMap<>();
        hash2.put(new Country("en"), new Student("Vasy",26));
        System.out.println(hash2.toString());
        
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("kOzlov",26));
        students.add(new Student("ivanov",27));
        Collections.sort(students);
        
        ArrayList<Country> country = new ArrayList<>();
        country.add(new Country("en"));
        country.add(new Country("ru"));
        country.add(new Country("by"));
        
        Collections.sort(country, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
   
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        System.out.println(list3.toString());

        HashSet<Integer> set = new HashSet<>(list3);

        list3.clear();
        list3.addAll(set);
        System.out.println(list3.toString());
                
            }
                
        }
               

