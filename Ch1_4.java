package interestingprogram;

import java.applet.Applet;
import java.awt.*;

/**
 * Author:weiwei
 * description:
 * Creat:${Date}
 **/
public class Ch1_4 extends Applet {
    //clr[]存储颜色
    private Color clr[]={Color.blue,Color.black,Color.red,Color.yellow,Color.green};
    //x[]存储圆心的x的坐标
    //y[]存储圆心的y的坐标
    private int[] x={100,136,172,118,154};
    private int[] y={60,60,60,91,91};
    //存储圆心坐标
    private int[] [] xy={{100,60},{136,60},{172,60},{118,91},{154,91}};
    private int r=20,d=40;
    //画图方法
    public void paint(Graphics g){
        //设置字体,字体大小
        Font font=new Font("楷体",Font.PLAIN,20);
        g.setFont(font);
        //循环五次.画五个圆环
        for(int i=0;i<5;i++){
            g.setColor(clr[i]);
            //d代表圆外切矩形的长宽,相等代表圆
            g.drawOval(x[i],y[i],d,d);
        }
        //设置颜色
        g.setColor(Color.BLUE);
        g.setFont(font);
        g.drawString("奥运五环旗",120,169);
    }
}
