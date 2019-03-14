package multi;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Author:weiwei
 * description:客户端给服务端发送数据的线程
 * 发送的数据来自命令行的交互式输入
 * Creat:2019/3/12
 **/
public class WriteDataToServerThread extends Thread{
    private final Socket client;
    public WriteDataToServerThread(Socket client){
        this.client = client;
    }
    @Override
    public void run(){
        OutputStream clientOutput = null;
        try {
            clientOutput = this.client.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(clientOutput);
            Scanner scanner = new Scanner(System.in);  //有客户端输入数据
            while(true){
                System.out.print("请输入>>");
                String data = scanner.nextLine(); //读数据
                if(data.equals("bye")){
                    break;
                }
            }
            this.client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
