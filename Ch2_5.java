package interestingprogram;

/**
 * Author:weiwei
 * description:肇后事车辆:有一个卡车司机肇事后向逃逸,但被三个人看见了其车牌号
 *             但是都没有看全,甲说:车牌前两位是一样的,乙说:车牌后两位是一样的,
 *             但与前两位不一样,丙说:车牌是一个数字的平方(车牌号四位),请计算出
 *             车牌号是多少
 * Creat:2019/2/15
 **/
public class Ch2_5 {
    public static void main(String[] args) {
        int t;
        //i表示最高位上的数字
        for(int i=1;i<=9;i++){
            //j代表最低位上的数字
            for(int j=1;j<=9;j++){
                if(i != j){
                    //i,j组成的四位数字
                    t=i*1000+i*100+j*10+j;
                    //k的取值根据四位字开方得到的大概范围
                    for(int k=30;k<100;k++){
                        if(k==Math.sqrt(t)){
                            System.out.println("车牌号是: "+ k*k);
                        }
                    }
                }
            }
        }
    }
}
