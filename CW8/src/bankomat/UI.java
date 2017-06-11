package bankomat;


public class UI implements OnBankomatListener{
    
    public void startUi(){
        Bankomat bankomat = new Bankomat();
        
        bankomat.setUi(this);/*
        private Bankomat.OnBankomatListener listener = new Bankomat.OnBankomatListener() {//в виде пременной и интерфейс здесь запихан в банкомат
        @Override
            public void onGetMoney(int money) {
                System.out.println("деньги получены");
            }

            @Override
            public void onSetMoney(boolean isOk) {
               System.out.println("Деньги отправлены");
            }
        });
        bankomat.setUi(listener);
        */
       /* bankomat.setUi(new OnBankomatListener() {//и сверху нужно убрать имплементирование
            @Override
            public void onGetMoney(int money) {
                System.out.println("деньги получены");
            }

            @Override
            public void onSetMoney(boolean isOk) {
               System.out.println("Деньги отправлены");
            }
        });*/
        
        bankomat.getMoney(70);
        bankomat.setMoney(100);
        
    }
    
    @Override
    public void onGetMoney(int money){
        if(money > 0){
            System.out.println("Деньги получены");
        } else {
            System.out.println("Ошибка, обратитесь в банк");
        }
    }
    
    @Override
    public void onSetMoney(boolean isOk){
        if(isOk){
            System.out.println("Деньги отправлены на счет");
        } else {
            System.out.println("Ошибка, обратитесь в банк");
        }
    }
    
}
