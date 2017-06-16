package exception;


public class MyEx extends Exception{
    private int code;

    public int getCode() {
        return code;
    }

    public MyEx(int code) {
        this.code = code;
    }   
}
