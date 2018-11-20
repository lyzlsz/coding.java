public class TestString{
	
	
	public static void main(String[] args){
		
		String str1="hello";
	    String str2="hello";
	    String str3="hello";
		String str4=new String("world");
		String str5="world";
		String str6=new String("world").intern();
		String str7="world";
		
	    System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
		System.out.println(str4 == str5);
		System.out.println(str6 == str7);
	}
	
	
	
}
