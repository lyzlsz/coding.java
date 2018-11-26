
//懒汉式单例模式
//特点：当第一次去使用Singleton对象的时候才会为其产生实例化对象的操作.
class Singleton{
	private static singleton instance;
	private Singleton(){
	}//构造方法私有
	public static Singleton getInstance(){
		if(instance==null){//表示此时还没有实例化
			instance=new singleton();
		}
		return instance;
	}
	public void print(){
		System.out.println("Hello world");
	}
	
}
public class SingletonTest2{
	
     public static void main(String[] agrs){
		 Singleton singleton=null;
		 Singleton = singleton.getInstance();
		 Singleton.print();
	 }
}