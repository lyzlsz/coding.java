package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Author:weiwei
 * Creat:2019/1/6
 **/
//向集合保存简单的Java类对象
class  Person{
    private String name;
    private Integer age;

    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person{"+"name="+name+'\''+",age="+age+"}";
    }
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return Objects.equals(name,person.name) && Objects.equals(age,person.age);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}
public class TestList1 {
    public static void main(String[] args) {
        List<Person> Personlist = new ArrayList<>();
        Personlist.add(new Person("Jack",20));
        Personlist.add(new Person("Alice",21));
        Personlist.add(new Person("lucky",22));
        //remove和contains方法必须依赖equals方法
        Personlist.remove(new Person("Jack",20));
        //Personlist.contains(new Person("Alice",21)); //contains方法应该按照下面的写法
        //Personlist.contains(new Person("Mark",23));
        //System.out.println(Personlist);
        System.out.println(Personlist.contains(new Person("Jack",20)));
        System.out.println(Personlist.contains(new Person("Mark",20)));
        for(Person p : Personlist){
            System.out.println(p);
        }
    }
}
