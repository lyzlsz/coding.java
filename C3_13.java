public class C3_13{//计算s=1-1/2+1/3-1/4^^^^+1/n-1-1/n
	public static void main(String[] args){//奇数数项加,偶数项减
		double sum=0;
		int i=1;
		for(i=1;i<100;i++){
			if(i%2==1){//当i为奇数时-->加
				sum+=1.0/i;
			}
			else{//否则当i为偶数时-->减
				sum-=1.0/i;
			}
		}
		System.out.print("sum="+sum);
	}
}
		