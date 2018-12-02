class Solution{
	public boolean isHappy(int n){
		int sum=0;
		while(n<9){
			sum+=Math.pow(n%10,2);
			n=n/10;
		}
		sum+=Math.pow(n,2);
		if(sum>9){
			return isHappy(sum);
		}
		if(sum==1){
			return true;
		}else {
			return false;
		}
	}
}
		