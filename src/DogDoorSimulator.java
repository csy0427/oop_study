/**
 * Created by daou on 2017-07-06.
 */
public class DogDoorSimulator {
    public static void main(String[] args){
            DogDoor door=new DogDoor();
            BarkRecognizer recognizer = new BarkRecognizer(door);
            Remote remote=new Remote(door);

            System.out.println("Fido barks to go outside...");
            recognizer.recognize("Woof");
            remote.pressButton();
            System.out.println("\nFido has gone outside...");
            //remote.pressButton();
            System.out.println("\nFido's all done...");
           // remote.pressButton();
             System.out.println("\nFido's all done...");
           // remote.pressButton();
    }
}
