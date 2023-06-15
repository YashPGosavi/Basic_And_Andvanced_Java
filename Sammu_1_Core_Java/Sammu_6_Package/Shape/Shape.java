/* 
WRITE THIS CODE IN NOTEPAD bi** 
You have to create a package named com.codewithharry.shape 
This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere 
These classes should use inheritance to properly manage the code! 
Include methods Like 
volume, surface area and getters/setters for dimensions 
*/ 

package Sammu_1_Core_Java.Sammu_6_Package.Shape;
class Square { 
         public double side; 
	public void Sqarea() { 
				System.out.println( " Area of Square is :  "  + this.side*this.side); 
		 } 
 } 
class Rectangle extends Square { 
	public double breadh; 
	public void Recarea() { 
				System.out.println( " Area of Square is :  "  + this.side*this.breadh); 
		 } 
 } 
 
 
class Circle { 
	public double radius, area; 
	public void area() { 
		this.area =Math.PI*(this.radius*this.radius);
 				System.out.println( " Area of Circle is :  "  + this.area);
		 } 
 } 
 
class Sphere extends Circle { 
	public void SphereSurfaceArea() { 
				double a = 4*(this.area); 
				System.out.println( " Lateral Surface Area of Cylinder is :  " +a ); 
				 } 
 
 
	public void SphereVolume() { 
				double v = (4/3)*(this.area)*this.radius; 
				System.out.println( " Volume of Sphere is :  " +v ); 
				 } 
 } 
 
 
class Cylinder extends Sphere { 
	public double height; 
	public void CylinderLateralSurfaceArea() { 
				double a = 2 *( Math.PI *this.radius*this.height)+2*(this.area); 
				System.out.println( " Lateral Surface Area of Cylinder is :  " +a ); 
				 } 
 
	public void BaseArea() { 
				System.out.println( " Base Area of Cylinder is :  " +this.area ); 
				 } 
 
	public void CylinderVolume() { 
				double v = Math.PI*this.radius*this.radius*height; 
				System.out.println( " Volume of Cylinder is :  " +v ); 
				 } 
 } 
 
 
 
public class Shape { 
	public static void main(String[] args) { 
		Rectangle r = new Rectangle(); 
		r.side = 10; 
		r.Sqarea(); 
		 
		r. breadh = 20; 
		r.Recarea(); 
		 
		Cylinder c = new Cylinder(); 
		c. radius = 5; 
		c.area(); 
 
		c.SphereSurfaceArea(); 
		c.SphereVolume();

		c.height=4;
		c.CylinderLateralSurfaceArea(); 
		c. BaseArea(); 
		c.CylinderVolume(); 
 
				 } 
		 } 