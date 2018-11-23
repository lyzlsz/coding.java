abstract class CaffeineBeverage{
	final void prepareRecipe(){
		boilwater();
		brew();
		pourInCup();
		if (customerwantsCondiments()){
			addCondiments();
		}
	}
	abstract void brew();
	
	abstract void addCondiments();
	void boilwater(){
		System.out.println("Boiling water");
	}
	void pourInCup(){
		System.out.println("pouring into Cup");
	}
	boolean customerwantsCondiments(){
		return true;
	}
}
class Tea extends  CaffeineBeverage{
	void brew(){
		System.out.println("Steeping the tea");
	}
	void addCondiments(){
		System.out.println("Adding Lemon");
	}
}
class coffee extends CaffeineBeverage{
	void brew(){
		System.out.println("Dripping Coffee through filter");
	}
	void addCondiments(){
		System.out.println("Adding milk and sugar");
	}
	public boolean customerwantsCondiments(){
		String answer = getUserInput();
		if(answer.equals("y")){
			return true;
		}else {
			return false;
		}
	}
	private String getUserInput(){
		String answer =null;
		System.out.println("您想要加柠檬(牛奶和糖)吗?(y/n)");
		Scanner scanner=new Scanner(System.in);
		answer =scanner.nextLine();
		return answer;
	   }
	}
	public class Test{
		public static void main(String[] args){
			 CaffeineBeverage tea=new Tea();
			 CaffeineBeverage coffee=new coffee();
			 
			 System.out.println("\nMaking  Tea? ");
			 tea.prepareRecipe();
			 
			 
			 System.out.println("\nMaking coffee?");
			 coffee.prepareRecipe();
	    }
	}
		
		
	
		
		
