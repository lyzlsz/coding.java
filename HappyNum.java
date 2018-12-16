public class HappyNum{
	public static boolean isHappy(int n){
		while(true){
			int flag=getnext(n);
			if(flag==1){
				return true;
			}
			else {
				n=flag;
				if(n==89){
					return false;
				}
			}
		}
	}
	public int getnext(int num){
		int result=0;
		result=result+((num%10)*(num%10));
		num=num/10;
		if(num==0){
			return result;
		}else{
			return result+getnext(num);
		}
	}
	public static void main(String[] args){
		HappyNum happynum=new HappyNum();
		System.out.println(HappyNum.isHappy(19));
	}
}
