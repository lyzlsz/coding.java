package Abstract;

/**
 * package:Abstract
 * Description:abstract
 * @date:2019/6/27
 * @Author:weiwei
 **/
abstract class Person{
    private String name;//属性
    private String getName() {//普通方法
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void getPersonInfo();//抽象方法无方法体
}
class Student extends Person{
    public void getPersonInfo(){//子类覆写抽象方法
        System.out.println("i am a student");
    }
}
public class Test1{
    public static void main(String[] args) {
        Person person = new Student();//实例化子类,向上转型
        person.getPersonInfo();
    }
}

