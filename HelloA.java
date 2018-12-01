public class HelloA{
	public HelloA(){
		System.out.println("我是父类的构造块!");
	}
	{
		System.out.println("我是父类非静态块!");
	}
	static {
		System.out.println("我是父类的静态块!");
	}
}
class HelloB extends HelloA{
	public HelloB(){
		System.out.println("我是HelloB构造方法!");
	}
	{
		System.out.println("我是子类非静态块!");
	}
	static {
		System.out.println("我是子类的静态块!");
	}
	public static void main(String[] args){
		System.out.println("-------Start--------");
		new HelloB();
		new HelloB();
		System.out.println("--------end---------");
	}
}
	

