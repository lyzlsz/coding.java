import  java.util.Random;
import java.util.Scanner;

public class GressNum{
	private final int value;
	public GressNum(){
		Random random=new Random();
		this.value=random.nextInt(100);
	}
	public void play(){
		System.out.print("欢迎进入猜数字游戏!");
		int count=0;
		Scanner scanner=new Scanner(System.in);
		while(true){
			count++;
		    System.out.println("请输入您猜的数字:");
			int gressNum=scanner.nextInt();
		    if(gressNum>this.value){
			System.out.println("猜的数字大了!请重新输入:");
			}else if(gressNum<this.value){
			System.out.println("猜的数字小了!请重新输入:");
			}else{
				System.out.println("恭喜你!猜对了!");
				break;
			}
		}
		System.out.println("您一共猜了"+count+"次");
	}
	public static void main(String[] args){
		GressNum gressNum=new GressNum();
		gressNum.play();
	}
}
	
	

