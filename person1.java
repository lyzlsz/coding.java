public class person1{
	private  String name;
	private int age;
}
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public int getAge(){
	return age;
}
public void setAge(int age){
	this.age=age;
}
class student extends person{
	private String school;
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school=school;
	}
}
public class test {
	public static void main(String[] args){
		Student student=new Student;
		student.setName("steven");
		student.setAge(18);
		student.setSchool("高新一中");
        System.out.println("姓名："+student.getName()+"，年龄："+student.getAge()+",学
        校："+student.getSchool());
		}
}
	
		
