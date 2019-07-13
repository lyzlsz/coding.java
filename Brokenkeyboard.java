package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * package:Test
 * Description:TODO
 * @date:2019/7/13
 * @Author:weiwei
 **/
public class Brokenkeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.next();
        String typedOutString = sc.next();
        ArrayList<Character> wornOutkeys = new ArrayList<>();
        int size = originalString.length();
        int iOriginal = 0;
        int iTypeOut = 0;
        while(iOriginal < size){
            boolean wornOut = false;  //假设没有损坏
            char originalCh = originalString.charAt(iOriginal);
            char originalUpper = Character.toUpperCase(originalCh);//全部大写
            if(iTypeOut >= typedOutString.length()){
                //输出的字符已经结束
                wornOut = true;
            }else {
                char typeOutCh = typedOutString.charAt(iTypeOut);
                char typeOutUpper = Character.toUpperCase(typeOutCh);
                if(originalCh != typeOutUpper){
                    //应该看到输出的字符没有输出
                    wornOut = true;
                }
            }
            if(wornOut){
                if(!wornOutkeys.contains(originalUpper)){
                    wornOutkeys.add(originalUpper);
                }
                iOriginal++;
            }else{
                iOriginal++;
                iTypeOut++;
            }
        }
        for(int i = 0;i<wornOutkeys.size();i++){
            System.out.print(wornOutkeys.get(i));
        }
        System.out.println();
    }
}
