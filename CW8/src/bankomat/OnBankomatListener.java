package bankomat;


public interface OnBankomatListener {
     public void onGetMoney(int money);
     public void onSetMoney(boolean isOk);
    
}
