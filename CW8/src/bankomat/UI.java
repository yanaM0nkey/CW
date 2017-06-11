package bankomat;


public class UI implements OnBankomatListener{
    
    public void startUi(){
        Bankomat bankomat = new Bankomat();
        
        bankomat.setUi(this);/*
        private Bankomat.OnBankomatListener listener = new Bankomat.OnBankomatListener() {//� ���� ��������� � ��������� ����� ������� � ��������
        @Override
            public void onGetMoney(int money) {
                System.out.println("������ ��������");
            }

            @Override
            public void onSetMoney(boolean isOk) {
               System.out.println("������ ����������");
            }
        });
        bankomat.setUi(listener);
        */
       /* bankomat.setUi(new OnBankomatListener() {//� ������ ����� ������ �����������������
            @Override
            public void onGetMoney(int money) {
                System.out.println("������ ��������");
            }

            @Override
            public void onSetMoney(boolean isOk) {
               System.out.println("������ ����������");
            }
        });*/
        
        bankomat.getMoney(70);
        bankomat.setMoney(100);
        
    }
    
    @Override
    public void onGetMoney(int money){
        if(money > 0){
            System.out.println("������ ��������");
        } else {
            System.out.println("������, ���������� � ����");
        }
    }
    
    @Override
    public void onSetMoney(boolean isOk){
        if(isOk){
            System.out.println("������ ���������� �� ����");
        } else {
            System.out.println("������, ���������� � ����");
        }
    }
    
}
