package Set;

import java.util.Set;
import java.util.TreeSet;

/**
 * Author:weiwei
 * Creat:2019/1/6
 **/
//TreeSet排序分析
    //必须实现comparable接口,覆写compareTo方法
class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    @Override
    public String toString(){
        return "Person{"+"name='"+name+"\'"+",age="+age+"}";
    }
    @Override
    public int compareTo(Person o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }else{
            return this.name.compareTo(o.name);
        }
    }
    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public Integer  getage(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
}
public class TestSet2 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("Jack",20));
        set.add(new Person("Mike",21));
        set.add(new Person("Alice",23));
        System.out.println(set);
    }
}
