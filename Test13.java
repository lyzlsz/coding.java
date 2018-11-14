public  class Test13{
	public static void main(String[] args){
		Person person =new Student("张三");   //抽象类实例化对象通过其子类进行实例化
		system.out.println(person.getPersonInfo());
		
		Person person2 =new Teacher("李四");
		System.out.println(person.getPersonInfo());

		Person person3 =person.getPersonObject();
		 System.out.println(person.getPersonInfo());
		 
		 String info =new Person ("王五"){
		 public String getPersonInfo(){
			 return "医生姓名"+this.getName();
		 }
	}.getPersonInfo();
	System.out.println(info);
	
	
	// C c =new C();
	
	// F f=new new F();
	// A.E f1=new F();
	
}
}
abstract class Person {
	private String name;
	public Person (String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	abstract String getPersonInfo();
	
	public static Person getPersonObject(){
        //1.方法内部类（局部内部类）
        //2.匿名内部类
        
        /*
        class Worker extends Person {
            
             public Worker(String name){
                    super(name);//调用父类的构造方法
             }   
            
            public String getPersonInfo(){
                return "工人姓名："+this.getName();
            }
        }*/
        
      //匿名内部类 --> 必须继承一个父类或者实现一个接口
      return  new Person("王五"){
            
            public String getPersonInfo(){
                return "工人姓名："+this.getName();
            }
        };
    }
     
}

//1.子类继承抽象类 ，必须实现父类的抽象方法(所有)
//2.子类继承抽象类，如果没有覆写父类的抽象方法(所有)，则必须使用abstract修饰子类（抽象类）
//3. 如果抽象类没有无参构造方法，那么子类必须通过super明确指定父类构造方法
class Student extends Person{
    
    public Student(String name){
        super(name);
    }
    
    public String getPersonInfo(){
        return "学生姓名："+this.getName();
    }
}

class Teacher extends Person{
     public Teacher(String name){
        super(name);
    }
    
    public String getPersonInfo(){
        return "老师姓名："+this.getName();
    }
}


abstract class A {
    
    abstract class B{
        
    }

    //静态抽象内部类
    static abstract class E{
        
    }
    
}

class C extends A {
    
    class D extends B{
        
    }
}

//静态抽象内部类子类
class F extends A.E{
    
}
	



