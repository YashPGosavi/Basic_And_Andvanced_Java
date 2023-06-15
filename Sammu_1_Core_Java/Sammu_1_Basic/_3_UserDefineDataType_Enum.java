package Sammu_1_Core_Java.Sammu_1_Basic;

public class _3_UserDefineDataType_Enum {
    enum directions{
        East,West,South,North;

    }
    public static void main(String args[]){

        directions e =  directions.East;
        directions w =  directions.West;
        directions s =  directions.South;
        directions n =  directions.North;

        System.out.println("\nDirect Call : " + e);

        System.out.print("\nUsing Switch Case : ");
        switch(n){
            case East:
                System.out.println(e);
                break;
            case West:
                System.out.println(w);
                break;
            case South:
                System.out.println(s);
                break;
            case North:
                System.out.println(n);
                break;
        }

    }
}