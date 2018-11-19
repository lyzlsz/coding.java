public class TestParking {
	public static void main(String[] args){
		Parking parking=new Parking;
		
		Car bus =new Bus();
		Car trcuck =new Truck();
		Car auto=new Auto();
		Car motor=new Motor();
		
		Parking.park(bus);
		Parking.park(truck);
		Parking.park(auto);
		Parking.park(motor);
	}
}
class paking{
	private static final int standardLength=3;
	private static final int standardWidth=2;
	

	public Parking(int length,int width){
		this.standardLength=length;
		this.standardWidth=width;
    }

    public void park(Car car){
		if(Car.length()<=standardLength && Car.width()<=standardWidth){
			System.out.println("这个车可以停:"+car);
		}else{
			System.out.println("这个车不能停:"+car);
		}
	}
}
	 
	 
interface Car{
	//车的长度
	int length();
	//车的宽度
	int width();
	
}
class Bus implements Car{
	public int length(){
		return 8;
	}
	public int width(){
		return 4;
	}
	
	public String toString(){
		return"Bus width="+this.width()+"length="+this.length();
	}
}
class Auto implements Car{
	public int Length(){
		return 3;	
	}
	public int Width(){
		return 2;
	}
	public String toString(){
		return "Auto width="+this.width()+"length="this.length();
	}
}
class Motor implements Car{
	public int Length(){
		return 2;
	}
	public int Width(){
		return 1;
	}
	public String toString(){
		return "Motor width="+this.width()+"length="this.length();
	}
	
}


