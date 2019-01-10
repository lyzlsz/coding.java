package Stack;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Author:weiwei
 * Creat:2019/1/9
 **/
//Stream流中MapReduce操作
    //一个简单的数据统计操作
class Order{
    private String title;
    private double price;
    private int amount;

    public Order(String title,double price,int amount){
        this.title=title;
        this.price=price;
        this.amount=amount;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
public class Test5 {
    public static void main(String[] args) {
        List<Order> orderlist = new ArrayList<>();
        orderlist.add(new Order("Iphone",8990,90));
        orderlist.add(new Order("笔记本电脑",6000,890));
        orderlist.add(new Order("小米手机",4500,400));
        orderlist.add(new Order("三星手机",6000,100));

//        double allPrice = orderlist.stream().map((obj)->obj.getPrice()*obj.getAmount())
//                .reduce((sum,x)->sum+x).get();
//        System.out.println("所消费的总额为:"+allPrice);


        //用DoubleStream接口对象
        DoubleSummaryStatistics dss = orderlist.stream().
                mapToDouble((obj)->obj.getPrice()*obj.getAmount()).summaryStatistics();
        System.out.println("总量:"+dss.getCount());
        System.out.println("平均值:"+dss.getAverage());
        System.out.println("最大值:"+dss.getMax());
        System.out.println("最小值:"+dss.getMin());
        System.out.println("总和:"+dss.getSum());
    }
}
