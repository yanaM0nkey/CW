package interf;

public class Button {
 
    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    
    
    public void onTouch(){
        listener.onClick();
    }
    
}
