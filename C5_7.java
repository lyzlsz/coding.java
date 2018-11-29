class A11{   //子类和父类同时创建相同名字的数据成员,即子类有了两个相同名字的数据成员
	int x=8;  //当子类用这个数据成员时,默认操in用自己定义的数据成员
}             //而把从父类继承来的数据成员"隐藏"起来
class C5_7 extends A11{//当子类要引用这个数据成员的时候,用关键字super
	int x=24;
	public static void main(String[] agrs){
		int s1,s2;
		A11 p=new A11();//创建父类p的对象
		C5_7 p1=new C5_7();//创建子类p1的对象
		s1=p.x;
		s2=p1.x;
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
	}
}
