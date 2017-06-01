package cw5;

public class CW5 {

    public static final String CONSTANT = "kjfhs";//константа, ВСЁ БОЛЬШИМИ БУКВАМИ
    
    public static void main(String[] args) {
        
        Patient p0 = new Patient("AAAA", 12);
        Patient p1 = new Patient("BBBB", 22);
        //Patient p2 = new Patient("nvdd", 32);
        //Patient p3 = new Patient();
       // System.out.println(p.getAge());
       
       //System.out.println("AAAA" + "BBBBB" + "CCCC" + "DDDDD");
       StringBuilder st = new StringBuilder(); //StringBuffer для многопоточной программы
       st.append("AAAAA");
       st.append("BBBBB");
       st.append("CCCCC");
       st.append("DDDDD");
       System.out.println(st.toString());
       System.out.println("jfdfhlk00".concat("kzjnfk"));
       
       
       
    }
    
}
