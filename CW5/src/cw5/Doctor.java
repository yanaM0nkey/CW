package cw5;

public class Doctor extends People{
    private int room;

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public void myTest() {
        System.out.println("Doctor myTest");
    }
    
}
