package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import static reflect.BeanOperation.initCap;

/**
 * Author:weiwei
 * description:
 * Creat:20191/26
 **/

public class Company {
    private Integer cid;
    private String cname;
    private String address;
    private Date createDate;

    public String getcName() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString(){
        return "Company{"+"cname='"+cname+"\'"+",address="+address+"\'"+"}";
    }
}
class Enp{
    private String ename;
    private String job;
    private Double salary;
    private Date hireDate;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
class Dept {
    private String dname;
    private String loc;
    private Long count;  //总员工数量

    public String getDname() {
        return dname;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public static void setObjectValue(Object obj, String attribute, Object value)
            throws Exception  {
        Field field=obj.getClass().getDeclaredField(attribute);
        //判断属性是否存在
        if(field == null){
            //第二次尝试从父类中取得该属性
            field =obj.getClass().getField(attribute);
        }
        if(field == null){
            //两次都未取得该属性,说明该对象一定不存在
            return ;
        }
        String methodName="set"+initCap(attribute);
        Method setMethod=obj.getClass().getMethod(methodName,field.getType());
        setMethod.invoke(obj,value);
    }
}