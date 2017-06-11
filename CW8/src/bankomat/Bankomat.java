package bankomat;


public class Bankomat {
    
    private int count20 = 10;
    private int count50 = 5;
    private int count100 = 2;
    private OnBankomatListener ui = null;

    public void setUi(OnBankomatListener ui) {
        this.ui = ui;
    }
    
    public void getMoney( int value){
        
        //реализация
        //ожидание
        ui.onGetMoney(value);
        
    }
    
    public void setMoney(int value){
       //реализация
       //ожидание
       ui.onSetMoney(false);
    }
    
    
    
}
