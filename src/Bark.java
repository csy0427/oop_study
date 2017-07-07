/**
 * Created by daou on 2017-07-07.
 */
public class Bark {
    private String sound;
    public Bark(String sound){
        this.sound=sound;
    }
    public String getSound(){
        return sound;
    }
    public boolean equals(Object bark){
        if(bark instanceof Bark){
            Bark otherBark=(Bark) bark;//cascading
            if(this.sound.equalsIgnoreCase(otherBark.sound)) return true;
        }
        return false;
    }
}
