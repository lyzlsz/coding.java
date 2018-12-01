class A1{
	int x=27;
	private int z=10;//不能被子类继承的私有数据成员
}
class C5_6 extends A1{//A1是C5_6的父类,C5_6是A1的子类
	public static void main(String[] args){
		C5_6 p=new C5_6();//创建一个C5_6类的P的对象
		System.out.println("p.x="+p.x);//输出继承来的数据成员的值
		//System.out.println("p.z="+p.z);//错,因为z是private修饰,不能继承
	}
}