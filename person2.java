public class Person2{

	private String name;

	private String sex;

	private int tel;

	private String post;

	private int age;

	private String adress;

	

	public Person(String name, String sex){

		this.name = name;

		this.sex = sex;

	}

	public Person(String name, String sex, int tel){

		this(name, sex);

		this.tel = tel;

	}

	public Person(String name, String sex, int tel, String post){

		this(name, sex, tel);

		this.post = post;

	}

	public Person(String name, String sex, int tel, String post, int age){

		this(name, sex, tel, post);

		this.age = age;

	}

	public Person(String name, String sex, int tel, String post, int age, String adress){

		this(name, sex, tel, post, age);

		this.adress = adress;

	}

	

	public  static String personInfo(){

		System.out.print("Name:"+name+"\tPost:"+post);

	}

	

    public static void main(String[] args){

		Person person = new Person("Mary", "HD Director");

		System.out.println(person.personInfo());

	}

}
