package List;

import java.util.ArrayList;
import java.util.List;

/**
 * package:List
 * Description:查找数组中重复元素
 * @date:2019/5/16
 * @Author:weiwei
 **/
public class findDuplicate {
    public List<Integer> findDuplicates(int[] nums){
        List<Integer> rs = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                rs.add(Math.abs(nums[i]));
            }else{
                nums[Math.abs(nums[i])-1]*= -1;
            }
        }
        return rs;
    }
}
