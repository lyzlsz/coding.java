import com.bittech.SeqList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:weiwei
 * description:
 * Creat:2019/5/12
 **/
public class Main {

    private static void testList(List<Integer> list){
        list.clear();

        for(int i = 0;i<10;i++){
            list.add(i);
        }
        //[0,9]
        //迭代器
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int item = iterator.next(); //自动拆箱
            System.out.print(item + ",");
        }
        System.out.println();

        iterator = list.iterator();
        while(iterator.hasNext()){
            int item = iterator.next();
            System.out.println(item + ",");
            if(item == 5){
                iterator.remove();
            }
        }
        System.out.println();

        System.out.println(list);
        //[0..4,6...9]
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> seqList = new SeqList<>();
        testList(arrayList);
        testList(seqList);
    }
}
