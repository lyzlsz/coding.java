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
                    getLocalSocketAddress());

            //2. Socket发送和接收数据
            //2.1 发送数据
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            writer.write("你好,服务器.\n");
            writer.flush();

            //2.2 接收数据
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            String message = scanner.nextLine();
            System.out.println("接收到服务器的消息:"+message);

            //3. 关闭
            socket.close();
            System.out.println("客户端关闭");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
