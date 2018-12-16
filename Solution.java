public class Solution {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // Write your code here
        if(n==1){
			return true;
		}
		if(n<1){
			return false;
		}
		int count=0;
		while(n!=1){
			String s=n+"";
			char []arr=s.toCharArray();
			int sum=0;
			for(int i=0;i<arr.length;i++){
				sum+=Integer.parseInt(arr[i]+"")*Integer.parseInt(arr[i]+"");
			}
			n=sum;
			count++;
			if(count>1000){
			    return false;
			}
		}
		return true;
    }
}
public static void main(String[] args){
	Solution solution=new Sloution();
	System.out.println(Solution.isHappy(19));
}
