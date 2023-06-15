package Sammu_1_Core_Java.Sammu_5_OOP;

// Q1. Create a class circle and use inheritance to create Another class Cylinder from it.
//Create method area and Volume Also create getters and setters.

class circle1{
   public double radius,area;
   circle1(double radius){
       this.radius=radius;
   }
    public void setArea(){
        this.area=this.radius*this.radius*Math.PI;
    }

    public void getArea(){
        System.out.println("Area of circle is : " +area);
    }
}
class cylinder extends circle1{
    double height;
    cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
 double LateralArea,BaseArea,voulme;
  void setLateralArea(){
      this.LateralArea = 2*Math.PI*this.radius*this.height+2*Math.PI*this.radius*this.radius;
  }
  void getLateralArea(){
      System.out.println("Lateral area of cylinder is : " + LateralArea);
  }

    void setBaseArea(){
        this.BaseArea=area;
    }
    void getBaseArea(){
        System.out.println("Base area of cylinder is : " + BaseArea);
    }

    void setVolume(){
      this.voulme = Math.PI*this.radius*this.radius*this.height;
    }
    void getVolume(){
        System.out.println("Volume of cylinder is : " + voulme);
    }

}
public class _11_Inheritace_Practice_set {
    public static void main(String[] args) {
        cylinder c =new cylinder(2,3);
        c.setArea();
        c.getArea();

        c.setLateralArea();
        c.getLateralArea();

        c.setBaseArea();
        c.getBaseArea();

        c.setVolume();
        c.getVolume();
    }
}


/*
//Create a class Rectangle And use inheritance to create another class cuboid Try to keep it as close to real world Scenario
  as possible.
//Create methods for area and volume Also create getters and setters.
 */
//class Rectangle{
//    protected double length,breadth,area;
//    protected void setArea(){
//        this.area=length*breadth;
//    }
//    protected void getArea(){
//        System.out.println("The area of Rectangle : " + this.area);
//    }
//}
//class Cuboid extends Rectangle{
//    protected double height,LateralSurfaceArea,TotalSurfaceArea,Volume;
//
//    protected void setLateralSurfaceArea() {
//            this.LateralSurfaceArea=2*height*(length + breadth);
//        }
//
//    protected void getLateralSurfaceArea() {
//        System.out.println("Lateral surface area of a Cuboid is : "+ LateralSurfaceArea);
//    }
//
//    protected void setTotalSurfaceArea() {
//        TotalSurfaceArea =(2 *(length * breadth + breadth * height + length * height)) ;
//    }
//
//    protected void getTotalSurfaceArea() {
//        System.out.println("Total Surface area of Cuboid is : "+ TotalSurfaceArea);
//    }
//
//    protected void setVolume() {
//        Volume = (length * breadth * height);
//    }
//
//    protected void getVolume() {
//        System.out.println("Volume of Cuboid is : "+ Volume);
//    }
//}
//public class Sammu_31_Inheritace_Practice_set {
//    public static void main(String[] args) {
//        Cuboid c = new Cuboid();
//        c.length=2;
//        c.breadth=3;
//
//        c.setArea();
//        c.getArea();
//
//        c.height=4;
//
//        c.setLateralSurfaceArea();
//        c.setTotalSurfaceArea();
//        c.setVolume();
//
//        c.getLateralSurfaceArea();
//        c.getTotalSurfaceArea();
//        c.getVolume();
//
//    }
//}