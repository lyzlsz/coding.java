public class TestObject{
	
	
	
	public static void main(String[] agrs){
		String str1="123";
		int num1=Integer.parseInt(str1);
		//int num2=Integer.parseInt(str1,16);
		//radix:当前转换字符表示的是数字的进制
		System.out.println(num1);
		//System.out.println(num2);
		
		String str2="123.43";
		double num2=Double.parseDouble(str2);
		System.out.println(num2);
		String str3="truesds";
		boolean num3=Boolean.parseBoolean(str3);
		System.out.println(num3);
		System.out.println("---------------");
		
		String intStr=String.valueOf(1);
		String doubleStr=String.valueOf(123.14);
		String booleanStr=String.valueOf(true);
		System.out.println(intStr);
		System.out.println(doubleStr);
		System.out.println(booleanStr);
		//java语言中参数传递:值传递(栈空间的内容)
		//基本数据类型->栈空间
		//引用数据类型变量->栈空间->引用的对象所在堆空间的地址
	}
}
		
		

