/**
 * Created by daou on 2017-07-06.
 */

public class DogDoor {
    private boolean open;
    private Bark allowedBark;
    public DogDoor(){
        this.open=false;//initialize
    }
    public void setAllowedBark(Bark bark){
        this.allowedBark=bark;
    }
    public Bark getAllowedBark(){
        return allowedBark;
    }
    public void open(){
        System.out.println("The dog door opens.");
        open=true;
    }
    public void close(){
        System.out.println("The dog door closes.");
        open=false;
    }
    public boolean isOpen(){
        return open;
    }
}
