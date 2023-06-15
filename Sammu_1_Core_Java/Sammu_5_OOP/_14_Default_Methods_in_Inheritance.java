/*
Default Method :-
1) We can't update the interface after implementation of code (and we don't want to change functionality of the Pre-existing code) to overcome this problem java 8 introduced default method
   to ensure the backward compatibility while updating an Interface.
2) An interface can have static and default methods enable us to add the new functionality to existing interface.
3) Classes implementing interface need not implement default methods.
4) Interfaces can also include private methods for default methods to use.( which is use as

 */

package Sammu_1_Core_Java.Sammu_5_OOP;
class Cellphone1{
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
interface Camera1{
    public void takeSnap();
    public void recordVideo();
    default public void record4kVideo()       // To fix failure of implemented classes by changing in the interface, default method is use as quick fix method.
    {
        System.out.println("recording in 4K...");
    }

    private void closeCam(){
        System.out.println("Camera is closed...");
    }
}
interface GPS1{
    public void trackMyLocation();
}
interface Media_player1{
    public void playSong();
    public void playVideo();
}
class Smartphone1 extends Cellphone1 implements GPS1, Camera1, Media_player1{
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
    public void record4kVideo()                     // This is override method.
    {
        System.out.println("Take a snap and recording in 4K...");
    }
}

public class _14_Default_Methods_in_Inheritance {
    public static void main(String[] args) {
        Smartphone1 s = new Smartphone1();
        s.call(940411);
        s.pickCall();
        s.trackMyLocation();
        s.takeSnap();
        s.recordVideo();
        s.playSong();
        s.playVideo();
        s.record4kVideo();
        //s.closeCam(); --> We can't use this method as it is private.
    }
}
