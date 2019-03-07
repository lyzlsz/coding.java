package Thread;

/**
 * Author:weiwei
 * description:派分糖果
 * Creat:2019/3/7
 **/
public class Test0307 {
        public int candy(int[] ratings){
            int pre = 1, countDown = 0, total = 1;
            for (int i = 1; i < ratings.length; i++) {
                if (ratings[i] >= ratings[i - 1]) {
                    if (countDown > 0) {
                        total += countDown * (countDown + 1) / 2;
                        if (countDown >= pre) {
                            total += countDown - pre + 1;
                        }
                        pre = 1;
                        countDown = 0;
                    }
                    pre = ratings[i] == ratings[i - 1] ? 1 : pre + 1;
                    total += pre;
                } else {
                    countDown++;
                }
            }
            if (countDown > 0) {
                total += countDown * (countDown + 1) / 2;
                if (countDown >= pre) {
                    total += countDown - pre + 1;
                }
            }
            return total;
        }
    public static void main(String[] args) {
    }
}

