package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:weiwei
 * Creat:2019/1/23
 **/
public class TestProperty2 {
    public static void main(String[] args) {

        //1.指定格式字符串
        //value = emp.ename:Jack/emp.job:java测试工程师

        Emp emp = new Emp();
        String content = "emp.ename:Jack/emp.job:java测试工程师|emp.age:33";
        ObjectUtil objectUtil =new  ObjectUtil();
        Map<String,Object> map = objectUtil.parseAttributeAndValue(content);
        for(Map.Entry<String,Object> entry : map.entrySet()){
            objectUtil.setObjectValue(emp,entry.getKey(),entry.getValue());
        }
        System.out.println(emp);
 }

    private static class Emp {
    }
}
class ObjectUtil{
    public Map<String,Object> parseAttributeAndValue(String content){
        Map<String,Object> attributeAndValueMap = new HashMap<>();
        if(content != null || content.length()>0){
            //value:emp.ename:Jack|emp.job:java测试工程师
            //emp.ename:Jack
            //emp.job:java测试工程师
            String []pairs = content.split("\\|");
            for(String p:pairs){
                //emp.ename:Jack
                String [] attributeValue = p.split(":");
                String attributeTemp = attributeValue[0];
                int index = attributeTemp.lastIndexOf(".");
                if(index == -1){
                }else{
                    String attribute = attributeTemp.substring(index +1);
                    attribute=
                            attribute.substring(0,1).toUpperCase()
                            +(attribute.length() == 1 ? "" : attribute.substring(1));
                    String value=attributeValue[1];
                    attributeAndValueMap.put(attribute,value);
                }
            }
        }
        return attributeAndValueMap;
    }
    public void setObjectValue(Object object,String attribute,Object value){
        Class classz =object.getClass();
        try{
            Method[] methods = classz.getMethods();
            Method method =null;
            for(Method m:methods){
                if(m.getName().equals("set"+attribute)){
                    method=m;
                }
            }
            //单独处理Integer
            Parameter parameter =method.getParameters()[0];
            if(parameter.getType() == Integer.class){
                method.invoke(object,Integer.parseInt(String.valueOf(value)));
            }else{
                method.invoke(object,value);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public Object getObjectValue(Object object,String attribute){
        Class classz= object.getClass();
        try{
            //获取getXXX
            Method methods= classz.getMethod("get"+attribute);
            //调用getXxx
            return methods.invoke(object);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
