/*

                         Cellphone                             GPS                Camera                  Media Player
                             |                                  |                   |                          |
                             ____________________________________________________________________________________
                                                               |
          (here cellphone extends smartphone)               Smartphone            (Here GPS, Camera, MediaPlayer implements smartphone)

It is same like dynamic method dispatch.
 */
package Sammu_1_Core_Java.Sammu_5_OOP;
class Cellphone2{
    int number;
    public void call(int number){
        this.number=number;
        System.out.println("Calling..."+number);
    }
    public void pickCall() {
        this.number=number;
        System.out.println("Call is connected..."+number);
    }

}

interface GPS2{
    public void trackMyLocation();}

interface Camera2{
    public void takeSnap();
    public void recordVideo();
    default public void record4kVideo(){
        System.out.println("recording in 4K...");
    }
}
interface Media_player2{
    public void playSong();
    public void playVideo();
}
class Smartphone2 extends Cellphone2 implements GPS2, Camera2, Media_player2{
    @Override

    public void trackMyLocation(){
        System.out.println("Your Location is tracked...");
    }
    public void takeSnap(){
        System.out.println("Snap is taken...");
    };
    public void recordVideo(){
        System.out.println("Video is recorded...");
    };

    public void playSong(){
        System.out.println("Song is noe playing...");
    };
    public void playVideo(){
        System.out.println("Video is playing...");
    }
}


public class _16_Polymorphism_in_Inteface {
    public static void main(String[] args) {
        Camera2 c = new Smartphone2();
        c.record4kVideo(); //--> This State that use only Smartphone camera.
        //--> c.trackMyLocation(); --> This is not Allowed.

        System.out.println("******************************************************************************************");

        GPS2 g = new Smartphone2();
        g.trackMyLocation(); //--> This State that use only smartphone GPS.
        //--> g.playSong();  --> Not Allowed.

        System.out.println("******************************************************************************************");


        Smartphone2  s = new Smartphone2(); //--> This state that we use all smartphone methods.
        s.call(940411);
        s.pickCall();
        s.trackMyLocation();
        s.takeSnap();
        s.recordVideo();
        s.playSong();
        s.playVideo();
    }
}
