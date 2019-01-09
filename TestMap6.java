package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Author:weiwei
 * Creat:2019/1/8
 **/
//Map中自定义key,覆写hashcode(),equals()方法
class Person{
    private String name;
    private Integer  age;

    public Person(String name,Integer age){
        this.name=name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person{"+"age="+age+",name"+name+"\'"+"}";
    }
    @Override
    public boolean equals(Object o){
    if(this == o)
        return true;
    if(o == null || getClass() !=o.getClass())
        return false;
    Person person = (Person) o;
    return Objects.equals(age,person.age) &&
            Objects.equals(name,person.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(age,name);
    }
    public Integer getAge(){
        return age;
    }
}
public class TestMap6 {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("Jack",15),"JK");
        map.put(new Person("Mike",20),"MK");
        System.out.println(map.get(new Person("Jack",15)));
        System.out.println(map.get(new Person("Mike",20)));
    }
}
