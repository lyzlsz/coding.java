package SingleThread.SingleClient;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Author:weiwei
 * Creat:2019/1/9
 * 单线程聊天室客户端
 **/

public class TestClient {
    public static void main(String[] args)throws IOException{
        String ServerName = "127.0.0.1";
        Integer port = 666;
        try{
            //创建客户端Socket连接服务器
            Socket client = new Socket(ServerName,port);
            System.out.println("连接上服务器,服务器地址为:"+client.getInetAddress());
            //获取输入输出流
            PrintStream out = new PrintStream(client.getOutputStream(),
                    true,"UTF-8");
            Scanner in = new Scanner(client.getInputStream());
            in.useDelimiter("\n");
            //向服务器输出内容
            out.println("Hi I am a Client!");
            //向服务器读取输入
            if (in.hasNext()) {
                System.out.println("服务器发送消息为: "+in.next());
            }
            in.close();
            out.close();
            client.close();
        }catch(IOException e){
            System.err.println("客户端通信出现异常,错误为: "+e);
        }
    }
}
