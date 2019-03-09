package single;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Author:weiwei
 * description:单线程聊天室服务端
 * Creat:2019/3/8
 **/
public class singleThreadserver {
    public static void main(String[] args) {

        try {

            //1. 创建服务端ServerSocket,监听6666端口
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("服务器启动..."+serverSocket.
                    getLocalSocketAddress());

            //2. 接收客户端连接
            Socket socket = serverSocket.accept();
            System.out.println("接收到客户端连接..."+socket.
                    getRemoteSocketAddress());  //接收远程客户端

            //3. 接收和发送数据
            //3.1 接收数据
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);   //字节流转字符流
            String message = scanner.nextLine();   //读一行
            System.out.println("收到客户端的消息:"+message);

            //3.2 发送数据
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);//字节流转字符流
            writer.write("你好,客户端,我很好.\n");  //写数据
            writer.flush();  //刷新(网通信)


            //4. 关闭
            serverSocket.close();
            System.out.println("服务器关闭");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
