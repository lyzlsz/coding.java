package multi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author:weiwei
 * description:多线程聊天室服务端
 * Creat:2019/3/12
 **/
public class multiThreadserver {
    public static void main(String[] args) {


        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(6666);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("服务器启动..." + serverSocket.
                    getLocalSocketAddress());  //服务器启动,打印本地地址

            //线程池
            ExecutorService executorService = Executors.newFixedThreadPool(25);


            while (true) {  //死循环
                Socket client = null;
                try {
                    client = serverSocket.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("有客户端连接到服务器:" + client.getRemoteSocketAddress());
                executorService.execute(new HandlerClient(client));
            }
        }
}




