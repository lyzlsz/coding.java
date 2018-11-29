//成员方法的继承
class A12{
	int x=0,y=1;
	void Myp(){
		System.out.println("x="+x+"  y="+y);
	}
	private void Printme(){//父类的私有方法,不能被子类继承
		System.out.println("x="+x+"  y="+y);
	}
}
	public class C5_8 extends A12{
	public static void main(String[] agrs){
		int z=3;
		C5_8 p1=new C5_8();
		p1.Myp();
		//p1.Printme();//错,私有方法不能继承
	}
	}
		
