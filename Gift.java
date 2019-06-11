package Test;

import java.util.Arrays;

/**
 * package:Test
 * Description:TODO
 *
 * @date:2019/6/11 0011
 * @Author:weiwei
 **/
public class Gift {
    public int getValue(int [] gifts,int n){
        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i =0;i<gifts.length;i++){
            if(gifts[i] == ans){
                num++;
            }
        }
        return num <= n/2 ? 0 : ans;
    }

    public static void main(String[] args) {

    }
}
