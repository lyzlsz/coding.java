public class SendFolwers{
	public static void main(String[] args){
		BoyFriendSendFlowers target=new BoyFriendSendFlowers("张三","李四");
		DelivermanSendFlowers proxyObject=new DeliverSendFlowers(target);
		proxyObject.Send();
	}
}
//业务接口
interface SendFlowers{
	void Send();
}
//业务类	
	
class BoyFriendSendFlowers implements SendFlowers{
	
	private String boyFriendName;
	private String girlFriendName;
	
	public BoyFriendSendFlowers(String boyFriendName,String girlFriendName){
		this.boyFriendName= boyFriendName;
		this.girlFriendName= girlFriendName;
	}
	public void send(){
		System.out.println(this.boyFriendName+"送花给"+this.girlFriendName);
	}
}
//代理类

class DelivemanSendFlowers implements SendFlowers{
	private final SendFlowers target;
	public DelivermanSendFlowers(SendFlowers target){
		this.target=target;
	}
	public void send(){
	  System.out.println("快递员给客户打电话");
	  this.target.send();
	  System.out.println("客户签收");
	}
}

	
	
	