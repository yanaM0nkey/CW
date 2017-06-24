package cw15;

public class CW15 {
    enum MYENUM{//как класс
        PARAM1,
        PARAM2,
        PARAM3              
        }
    public void test(MYENUM e){
        if(e == MYENUM.PARAM1){
            
        }
    }
    
    enum Gender{
        W(1),
        M(2);
        private int value;

        Gender(int Value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
}
    public static void main(String[] args) {
        Gender m = Gender.M;
        Gender w = Gender.W;
    }
    
}
