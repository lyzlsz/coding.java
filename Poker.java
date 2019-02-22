package Test;

import java.util.Random;

/**
 * Author:weiwei
 * description:发扑克牌
 * Creat:2019/2/22
 **/
class Card{
    int Suit;  //花色
    char Number;   //牌面数字
}
public class Poker {
    static Card[] OneCard = new Card[52];  //保存每张扑克牌的花色,数字

    //显示扑克牌
    static void showCard() {
        int i, j;
        String s = "";  //代表花色
        for (i = 0, j = 0; i < 52; i++, j++) { //扑克牌循环一遍
            if (j % 13 == 0) {
                System.out.println();
            }
            switch (OneCard[i].Suit) {  //根据花色属性,显示花色符号
                case 1:
                    s = "黑桃";   //1代表黑桃
                    break;
                case 2:
                    s = "红桃";   //2代表红桃
                    break;
                case 3:
                    s = "梅花";   //3代表梅花
                    break;
                case 4:
                    s = "方块";   //4代表方块
                    break;
                default:
                    ;
            }
            System.out.printf("  " + s + OneCard[i].Number);//输出显示
        }
        System.out.printf("\n");
    }

    //洗牌
    static void shutffle() {
        int i, j;
        Card tempcard = new Card();    //交换过程中临时备份用
        Random r = new Random();       //随机种子
        for (i = 0; i < 52; i++) {            //换52次牌
            j = r.nextInt(52);
            tempcard = OneCard[j];  //换牌
            OneCard[j] = OneCard[j];
            OneCard[i] = tempcard;
        }
    }

    public static void main(String[] args) {
        initial();   //生成一副新牌
        System.out.println("一副新牌的初始排列如下: ");
        showCard();//显示新牌的排列

        shutffle(); //洗牌
        System.out.println("洗牌后的排列顺序如下:");
        showCard();  //显示洗牌后的排列
    }


    //生成一副新牌
    private static void initial() {
        int i, temp;
        int suit;

        suit = 0;
        for (i = 0; i < 52; i++) {  //生成52张牌
            if (i % 13 == 0) {   //每13张,改变花色
                suit++;   //改变花色
            }
            Card t = new Card();  //生成扑克牌对象
            t.Suit = suit;        //保存花色
            temp = i % 13;        //牌main数字不超过13
            switch (temp) {        //牌面数字处理
                case 0:
                    t.Number = 'A';   //第一个数从0开始,代表A
                    break;
                case 9:
                    t.Number = '0';   //代表10
                    break;
                case 10:
                    t.Number = 'J';    //代表J
                    break;
                case 11:
                    t.Number = 'Q';     //代表Q
                    break;
                case 12:
                    t.Number = 'K';     //代表K
                    break;
                default:
                    t.Number = (char) (temp + '1');//其他普通数字,注意加1
            }
            OneCard[i] = t;    //保存扑克
        }
    }
}


