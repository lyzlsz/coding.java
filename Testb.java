class Person{
	public void fun(){
		this.print();
	}
	private void print(){
		System.out.println("1.****");
	}
}
class Student extends  Person {
	public void print(){
		System.out.println("2.####");
	}
}
public class Testb{
	public static void main(String[] args){
		new Student().fun();
	}
}