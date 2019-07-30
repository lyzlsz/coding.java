package multi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author:weiwei
 * description:多线程聊天室服务端
 * Creat:2019/3/12
 **/
public class multiThreadserver {

    public static void main(String[] args) {
        try {
            int port = 6666;
            if (args.length >= 1) {
                try {
                    port = Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    port = 6666;
                    System.out.println("指定端口不是有效格式的端口" +
                            ",范围是0-65535,采用默认端口" + port);
                }
            }
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("服务器启动..." + serverSocket.getLocalSocketAddress());  //服务器启动,打印本地地址

            //线程池
            ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

            while (true) {  //死循环
                Socket client = serverSocket.accept();
                System.out.println("有客户端连接到服务器:" + client.getRemoteSocketAddress());
                executorService.execute(new HandlerClient(client));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





