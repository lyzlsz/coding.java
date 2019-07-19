package Base2;

import java.util.Scanner;

/**
 * package:Base2
 * Description:TODO
 * @date:2019/7/19
 * @Author:weiwei
 **/
public class isHuiwen {
    public static boolean isHuiwen(String s){
        int i =0;
        int j = s.length() -1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        for(int i =0;i<str1.length();i++){
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i,str2);
            if(isHuiwen(sb.toString())){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
