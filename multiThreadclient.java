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
            Socket client = new Socket("127.0.0.1",6666); //先写数据再读数据,读写线程分离
            new ReadDataFromServerThread(client).start();
            new WriteDataToServerThread(client).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
