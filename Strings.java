//String类扩展功能实现
public class Strings{

     /**
     * 重复某个字符
     * 
     * 例如： 
     * 'a' 5   => "aaaaa"  
     * 'a' -1  => ""
     * 
     * @param c     被重复的字符
     * @param count 重复的数目，如果小于等于0则返回""
     * @return 重复字符字符串
     */
    public static String repeat(char c, int count) {
        if(count>0) {
        	char[] ch=new char[count];
        	for(int i=0;i<count;i++) {
        		ch[i]=c;
        	}
        	String str=new String(ch);//将字符数组转换为字符串
            return str;
        }else {        
            return "";
        }
    }
    
     /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如： 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
//   */
    public static String fillBefore(String str, char filledChar, int len) {
        StringBuffer sb = new StringBuffer(len);
        if(str == null){
        	return null;
        }else {
            if(len>0){
            	char[] ch=new char[len];//
            	for(int i=0;i<len;i++) {
            		ch[i]=filledChar;
            	}
            	String  str1=new String(ch);
            	String str2=str1+str;
            	return str2;
            }else {
            	return "";
            }
        }
}
            

    
    /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串<br>
     * 字符填充于字符串后
     * 例如： 
     * "abc" 'A' 5  => "abcAA"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
    public static String fillAfter(String str, char filledChar, int len) {
        StringBuffer sb = new StringBuffer(len);
        if(str == null){
            return null;
        }else {
            if(len>0){
                char[] ch=new char[len];
                for(int i=0;i<len;++i) {
                	ch[i]=filledChar;
                }
                String str1=new String(ch);
                String str2=str+str1;
                return str2;
            }else {
            	return "";
                 }
            }
}


    /**
     * 移除字符串中所有给定字符串
     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         字符串
     * @param strToRemove 被移除的字符串
     * @return 移除后的字符串
     */
    public static String removeAll(CharSequence str, CharSequence strToRemove) {
        String str1=str.toString();
        String str2=strToRemove.toString();
        if(str.length()<0) {
        	str1=str1.replaceAll(str2," ");
        	return str1;
        }else {
        	return null;
        }
}
        
        
    
    /**
     * 反转字符串
     * 例如：abcd => dcba
     *
     * @param str 被反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String str) {
        if(str ==null) {
        	return null;
        }else {
        	if(str.length()>0) {
        		char[] ch=str.toCharArray();
        		int left=0;
        		int right=ch.length-1;
        		while(left<=right) {
        			char tmp;
        			tmp=ch[left];
        			ch[left]=ch[right];
        			ch[right]=tmp;
        			left++;
        		}
        		String str1=new String(ch);
        		return str1;
        	}
        }
        return "";
}

public static void main(String[] args){
    System.out.println(repeat('a',4));
    System.out.println(fillBefore("abc",'a',5));
    System.out.println(fillAfter("abc",'a',5));
    System.out.println(removeAll("a-b-c-d","-"));
    System.out.println(reverse("abcd"));
}
}
