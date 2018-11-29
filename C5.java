class Student{
	public String name;
	public char gender;
	public int no;
	public int age;//student类的四个公有属性
	Student(int cno,String cname,char cgender,int cage){
		name=cname;
		gender=cgender;
		no=cno;
		age=cage;
	}
	public void showNo(){
		System.out.println("No:"+no);
	}
	public void showName(){
		System.out.println("Name:"+name);
	}
	public void showGender(){
		System.out.println("Gender:"+gender);
	}
	public void showAge(){
		System.out.println("Age:"+age);
	}
}
class StudentScore{//定义了一个学生分数类
	private int no;//私有属性
	private double score;
	public void sendScore(int cno,double cscore){
		//下面两句是对象发给自身的消息,要求给自己的数据成员赋值
		no=cno;//私有属性赋值(外界不知道)                   
		score=cscore;
	}
	void printScore(){
		System.out.println("No:"+no+"  score:"+score);
	}
}
	public class C5{
		public static void main(String[] agrs){
			int m;
			//下面两句发送new消息给Student类,要求创建st1,st2的对象(具体的)
			Student st1=new Student(101,"zhangli",'F',18);
			Student st2=new Student(102,"hongbing",'M',17);
			//下面两句发送new消息给StudentScore类,要求创建sc1,sc2的对象
			StudentScore sc1=new StudentScore();
			StudentScore sc2=new StudentScore();
			st1.showNo();//这是一条消息,消息响应显示st1的对象的学号
			st1.showName();//显示对象姓名的消息
			st1.showAge();//显示对象年龄的消息
			st1.age=20;//修改对象的数据成员的消息,修改st1对象的年龄
			m=st1.age;//将返回消息赋值给变量m
			System.out.println("m="+m);
			st2.showNo();
			st2.showName();
			//向sc1,sc2的对象各发送一条按学号输入成绩单的消息,这些消息都是公有消息
			sc1.sendScore(101,97);
			sc2.sendScore(102,84);
			//向sc1,sc2的对象各发送一个打印消息,这些消息都是公有消息
			sc1.printScore();
			sc2.printScore();
		}
	}

			
	
	
