class Addclass2{
	public int x=0,y=0,z=0;
	Addclass2(int x)
	{
		this.x=x;
	}
	Addclass2(int x,int y){
		this.x=x;
		this.y=y;
	}
	Addclass2(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public int add() {
		return x+y+z;
	}
}

public class C5_15 extends  Addclass2{
	int a=0,b=0,c=0;
	C5_15(int x){
		super(x);
		a=x+7;
	}
	C5_15(int x,int y){
		super(x,y);
		a=x+5;b=y+5;
	}
	C5_15(int x,int y,int z){
		super(x,y,z);
		a=x+4;b=y+4;c=z+4;
	}
	
	public int add() {
		System.out.println("super:x+y+z="+super.add());
		return a+b+c;
	}
	public static void main(String[] args) {
		C5_15 p1=new C5_15(2,3,5);
		C5_15 p2=new C5_15(10,20);
		C5_15 p3=new C5_15(1);
		System.out.println("a+b+c="+p1.add());
		System.out.println("a+b="+p2.add());
		System.out.println("a="+p3.add());
}
}