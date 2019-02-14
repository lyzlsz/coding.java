package interestingprogram;

/**
 * Author:weiwei
 * description:心形图案
 * Creat:2019/2/14
 **/

import java.applet.Applet;
import java.awt.*;

/**
 * 双缓存显示图片
 */
public class Ch1_7 extends Applet {
    int width,height;
    Image image;
    Graphics gl;

    public void init(){
        setBackground(Color.black);
        this.setSize(350,310);

        width = getSize().width;
        height = getSize().height;
        image = createImage(width,height);
        gl = image.getGraphics();
    }
    public void paint(Graphics g){
        gl.clearRect(0,0,width,height);
        gl.setColor(Color.red);
        int i,j;
        double x,y,r;

        for(i=0;i<=90;i++)
            for(j=0;j<=90;j++){
            //转换为直角坐标
                r=Math.PI/45*i*(1-Math.sin(Math.PI/45*j))*18;
                //为了在中间显示,加了偏移量
                x=r*Math.cos(Math.PI/45*j)*Math.sin(Math.PI/45*i)+width/2;
                y=-r*Math.sin(Math.PI/45*j)+height/4;
                //为了在中间显示加了偏移量
                gl.fillOval((int) x,(int)y,2,2);
                gl.fillRect((int) x,(int)y,1,1);
            }
            //显示缓存区的可变Image对象
        g.drawImage(image,0,0,this);
    }
}
