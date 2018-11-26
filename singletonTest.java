

class Singleton{
	private static Singleton instance=new Singleton();//在类的内部产生实例化对象
	//private singleton(){//private 声明构造
	//}
	public static Singleton getInstance(){
		return instance;
	}
	public void print(){
		System.out.println("Hello world");
	}
}
public class singletonTest{
	public static void main(String[] agrs){
		Singleton singleton=null;//声明对象
		singleton =Singleton.getInstance();//实例化对象
		singleton.print();
	}
}
		
