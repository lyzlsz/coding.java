public class 乘法口诀表 
{
    public static void main(String[] args) 
    {
		for(int line=1;line<=9;++line) 
		{
			for(int col=1;col<=line;++col)
			{	
		       System.out.print(line+"*"+col+"="+(line*col)+"\t");
		    }
			System.out.println();
		}
    }
}
