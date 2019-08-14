package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * package:com
 * Description:建大堆   最小的 K 个数
 * @date:2019/8/14
 * @Author:weiwei
 **/
public class GetLeatstNumbers2 {

    /**
     * 创建一个容量为 k 的容器来存放这个 k 个数,接下来从 n 个数中读取一个数,去和容器里面的数做比较
     * 如果容器里未满 k 个数,就将读取的这个数放进去,如果容器满了(已经有 k 个数)
     * 就替换容器中的数,替换的规则是:当前读取到的数如果比容器里面最大的数小,就将容器中最大的数移除,再将这个数
     * 插进去,如果这个数比容器里面最大的数还要大,就抛弃这个数
     * 所以当容器满了,我们需要做三件事:
     * 1.在 k 个数中找到最大的数
     * 2.将最大的数移除
     * 3.插入一个更小的新的数
     * 用二叉树实现这个容器,能在 O(nlogn)的时间复杂度在完成
     * 容器在数据结构中用最大堆,其根结点永远是最大的数,用红黑树来实现最大堆容器,TreeSet实现了红黑树的功能
     * 底层用TreeMap实现,Treeset 中的数会自动按升序排序,只要将数据放入TreeSet就会帮我们完成排序
     * @param nums
     * @param k
     * @return
     */
    public ArrayList<Integer> getLeatstNumbers2(int[] nums,int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lens = nums.length;
        if(lens == 0 || nums ==  null || k <= 0 || k > lens){
            return list;
        }

        TreeSet<Integer> kSet = new TreeSet<Integer>();
        for(int i = 0; i< lens;i++){
            if(kSet.size() < k){
                kSet.add(nums[i]);
            }else if( nums[i] < kSet.last()){
                    kSet.remove(kSet.last());
                    kSet.add(nums[i]);
            }
        }
        Iterator<Integer> iterator = kSet.iterator();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums = {7,3,8,2,9,1,6,4};
        GetLeatstNumbers2 getLeatstNumbers2 = new GetLeatstNumbers2();
        ArrayList<Integer> list = getLeatstNumbers2.getLeatstNumbers2(nums,4);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
