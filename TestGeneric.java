package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/22
 **/
//观察泛型上限
//class Message <T extends Number >{   //设置泛型上限
//    private T Message;
//
//    public T getMessage(){
//        return Message;
//    }
//
//    public void setMessage(T message){
//        this.Message=Message;
//    }
//}
//public class TestGeneric {
//    public static void main(String[] args) {
//        Message<Integer> message = new Message();
//        message.setMessage(55);
//        fun(message);
//    }
//     //此时使用通配符?描述的是它可以接受任意类型,但是由于不确定类型,无法进行修改
//    private static void fun(Message<? extends Number> temp) {
//        System.out.println(temp.getMessage());
//
//    }
//}

//设置泛型下限
class Message <T>{
    private T message;
    public T getMessage(){
        return message;
    }
    public void setMessage(T message){
        this.message= message;
    }
}

public class TestGeneric{
    public static void main(String[] args) {
        Message<String> message =new Message();
        message.setMessage("helloworld");
        fun(message);
    }

    private static void fun(Message<? super String> temp) {
        temp.setMessage("hello byte");  //此时可以修改
        System.out.println(temp.getMessage());
    }
}

//上限可以用在声明,不能修改,而下限只能用在方法参数,可以修改内容