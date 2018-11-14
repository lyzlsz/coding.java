 abstract class Person2 {
	 private  String name;  
	 public String  getName();{
		 return this.name;
	 }
	 public void setName(String name){
		 this.name=name;
	 }
	 public abstract void getPersonInfo(); //抽象方法,不包含方法体
}

class Student extends Person{
	public void getPersonInfo(){   //子类覆写父类方法
		System.out.print("I am a student");
	}
}
public class test{
	public  static void main(String[] args ){
	Person per=new Student();       //实例化(向上转型)
    per.getPersonInfo();	//父类类名 对象名=new 子类类名
	}								//被覆写的方法		 
}
	