package interestingprogram;


import java.util.*;

/**
 * Author:weiwei
 * description:人机猜数
 * Creat:2019/2/16
 **/
public class Ch10_7 {
    //把整数里的每一位提出来,放到Set集合里,过滤重复数字
    public static Set intToSet(int num,int n){
        Set s=new HashSet();
        //循环处理数字每一位,加入到Set集合里面
        for(int i=0;i<4;i++){
            s.add(num%10);
            num=num/10;    //重复的数字被过滤掉
        }
        return s;
    }

    public static void main(String[] args) {
        Set s1;     //存放计算机生成的数字
        Set s2;
        Scanner in=new Scanner(System.in);
        int c,g;
        int w=0;
        int n;
         Random r=new Random();
         int z=1000+9*r.nextInt(1000);

         int zb=z;

         s1=intToSet(z,4);
        System.out.printf("我已经想好了一个4位数字,请猜\n");
        //c:猜数次计数器
        for(c=1;;c++){
            System.out.println("请输入一个4位数: ");
            g=in.nextInt();   //请人猜
            s2=intToSet(g,4);    //把数字每一位放到集合中

            Iterator ite2=s2.iterator();  //生成迭代器
            n=0;
            //循环判断集合中重复元素
            while(ite2.hasNext()){
                if(s1.contains(ite2.next())){
                    n++;   //如果集合中找到重复元素,计数器就加1
                }
            }
            System.out.println("猜中国数字个数: "+n);

            z=zb;
            w=0;
            //循环判断数字的每一位是否相等
            for(int i=0;i<4;i++){
                if(g%10 == z% 10)
                    w++;
                g/=10;
                z/=10;
            }
            System.out.println("猜中数字位置个数:"+w+"\n");
            if(w==4){
                System.out.println("猜中总共用的次数: "+c);
                break;
            }
        }
    }
}
