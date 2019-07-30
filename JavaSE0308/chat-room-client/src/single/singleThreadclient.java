package single;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Author:weiwei
 * description:单线程聊天室客户端
 * Creat:2019/3/8
 **/
public class singleThreadclient {
    public static void main(String[] args) {

        try {

            //1. 创建Socket客户端,连接指定服务地址和端口号
            Socket socket = new Socket("127.0.0.1",6666);
            System.out.println("客户端创建..."+socket.
                    getLocalSocketAddress());  //客户端创建,打印当前地址

            //2. Socket发送和接收数据
            //2.1 发送数据
            OutputStream outputStream = socket.getOutputStream();  //获取字节流
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);  //字节流转字符流
            writer.write("你好,服务器.\n");  //写数据
            writer.flush();  //刷新

            //2.2 接收数据
            InputStream inputStream = socket.getInputStream();  //获取字节流
            Scanner scanner = new Scanner(inputStream);  //字节流转字符流
            String message = scanner.nextLine();  //读数据,按行读
            System.out.println("接收到服务器的消息:"+message); //打印接收到的数据

            //3. 关闭
            socket.close();
            System.out.println("客户端关闭");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
