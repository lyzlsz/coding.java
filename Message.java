package com.bittech.IO;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class Message implements  AutoCloseable{
    public void print(){
        System.out.println("message打印");
    }
    @Override
    public void close() throws Exception{
        System.out.println("message关闭");
    }

    public static void main(String[] args) {
        Message message= new Message;
        message.print();
        try{
            message.close();
        }catch (Exceptiion e){
            e.printStackTrace();
        }

    }


}
