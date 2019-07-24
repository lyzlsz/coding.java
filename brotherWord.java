package Test0724;

import java.util.*;

/**
 * package:Test0724
 * Description:TODO
 *
 * @date:2019/7/24 0024
 * @Author:weiwei
 **/
public class brotherWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while ((sc.hasNext())) {
            int cnt = sc.nextInt();
            String[] s = new String[cnt];
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < cnt; i++) {
                s[i]=sc.next();
                }
                String key = sc.next();
            for(int i=0;i<cnt;i++){
                if(check(key,s[i])){
                    list.add(s[i]);
                }
            }
            System.out.println(list.size());
            Collections.sort(list);//将list集合默认自然排序
            int num = sc.nextInt();
            if (num <= list.size()) {
                System.out.println(list.get(num - 1));
            }
        }
        sc.close();
    }

    public static boolean check(String key, String str) {
        if (key.length() != str.length() || key.equals(str))
            return true;
        char[] keyChar = key.toCharArray();//字符串转为数组
        char[] strChar = str.toCharArray();
        Arrays.sort(keyChar);//将该字符数组默认自然排序
        Arrays.sort(strChar);
        return Arrays.equals(keyChar,strChar);//比较两个字符数组是否相等
    }
}
