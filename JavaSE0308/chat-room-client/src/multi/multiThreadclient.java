package multi;

import java.io.IOException;
import java.net.Socket;

/**
 * Author:weiwei
 * description:多线程聊天室客户端
 * Creat:2019/3/12
 **/
public class multiThreadclient {

    public static void main(String[] args) {
        try {
            //读取地址
            String host = "127.0.0.1";
            if(args.length == 1){
                host = args[0];  //取第零个
            }
            //读取端口号
            int port = 6666;
            if (args.length == 2) {
                try {
                    port = Integer.parseInt(args[1]);//取第一个
                } catch (NumberFormatException e) {
                    port = 6666;
                    System.out.println("指定端口不是有效格式的端口" + ",范围是0-65535,采用默认端口" + port);
                }
            }
            Socket client = new Socket(host,port); //先写数据再读数据,读写线程分离
            new ReadDataFromServerThread(client).start();
            new WriteDataToServerThread(client).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
