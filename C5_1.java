class Student{
	public String name;
	public char sex;
	public int age;
	public int no;
	Student(int cno,String cname,char csex,int cage){
		name=cname;
		sex=csax;
		age=cage;
		no=cno;
	}
	public void showNo(){
		System.out.println("No:"+no);
	}
	public void showName(){
		System.out.println("Name:"+name);
	}
	public voud showAge(){
		System.out.println("age:"+age);
	}
	public void showSex(){
		System.out.println("Sex:"+sex);
	}
	class StudentScore{
		private int no;
		private double score;
		public void sendScore(int cno,double cscore){
			no=cno;
			score=cscore;
		}
		void printScore(){
			System.out.println("No:"+no+:" score:"+score);
		}
		public classC5_1{
			public static void main(String[] args){
				int m;
				Student st1=new Student(101,"zhang li","F",18);
				Student st2=new Student(102,"hong bing","M",17);
				StudentScore sc1=new StudentScore();
				StudentScore sc2=new StudentScore();
				st1.showNo();
				st1.showName();
				st1.showAge();
				st1.age=20;
				m=st1.age;
				System.out.println("m="+m);
				st2.showNo();
				st2.showName();
				sc1.sendScore(101,97);
				sc2.sendScore(102.84);
				sc1.printScore();
				sc2.printScore();
			}
		}
	}
}
				
