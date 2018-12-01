class A3{
	int x=90,y=10;
	public void Printme(){
		System.out.println("x="+x+" y="+y);
	}
}                                           
class C5_9 extends A3{
	int z=20;
	public void Printme(){//子类中定义了与父类同名的成员方法,实现覆盖
		System.out.println("z="+z);
	}
	public static void main(String[] args){
		A3 p2=new A3();  //创建父类p2的对象
		C5_9 p1=new C5_9();//创建子类p1的对象
		p1.Printme();//子类调用自身的方法,覆盖了父类的同名方法
		p2.Printme();//父类对象引用父类方法
	}
}
