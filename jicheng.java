package project1;
class Circle{
	double r;
	final double PI=3.14159265359;
	public Circle(double r) {
		this.r=r;
	}
	double area() {
		return PI*r*r;
	}
	double perimeter() {
		return 2*(this.area()/r);
	}
}
public class jicheng{
	public static void main(String[] args) {
		double x;
		Circle cir=new Circle(5.0);
		x=cir.area();
		System.out.println("圆的面积="+x);
		x=cir.perimeter();
		System.out.println("圆的周长="+x);
	}
}
