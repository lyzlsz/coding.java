/**
 * Author:weiwei
 * description:Object接收接口对象
 * Creat:2019/3/16
 **/

interface IMessage{
    public void getMessage();
}
class Messageimpl implements IMessage {
    @Override
    public String toString(){
        return "Hello";
    }
    @Override
    public void getMessage(){
        System.out.println("Hi");
    }
}
public class TestInterface {
    public static void main(String[] args) {
        IMessage msg = new Messageimpl();//子类向父类接口转型
        Object obj = msg;//接口向Object转型
        System.out.println(obj);
        IMessage temp = (IMessage)obj;//强制类型转换
        temp.getMessage();
    }
}
