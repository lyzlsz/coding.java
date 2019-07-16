package Base;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * package:Base
 * Description:TODO
 * @date:2019/7/16
 * @Author:weiwei
 **/
public class Frogtest {
    static int n = 0, m = 0, maxEnergy = 0;
    static int[][] map;
    static boolean flag = false;
    static String path = " ";
    static LinkedList<String> l = new LinkedList<>();

    public static void main(String[] args) {
        int p;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            p = sc.nextInt();
            map = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            runMap(0, 0, p);
            if (flag) {
                System.out.println(path);
            } else {
                System.out.println("Can not escape");
            }
        }
    }

    /**
     * 更新路径
     */
    public static void updataPath() {
        StringBuffer sb = new StringBuffer();
        Iterator<String> i = l.iterator();
        while (i.hasNext()) {
            sb.append(i.next() + ',');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        path = sb.toString();
    }

    /**
     * 走迷宫
     *
     * @param x      行
     * @param y      列
     * @param energy 能量
     */
    public static void runMap(int x, int y, int energy) {
        //如果边界越界或者能量消耗完或者此路不通的时候
        if (x < 0 || y < 0 || x >= m || y >= n || energy < 0 || map[x][y] != 1) {
            return;
        }
        //此路可以走
        else {
            map[x][y] = 2;
            l.offer("[" + x + "," + y + "]");
            if (x == 0 && y == m - 1) {//到达出口
                /**
                 * 到达出口要干的事
                 * 判断是不是最省能量的路径--->如果不是,更新路径
                 *                          如果是,退出递归,打印路径
                 */
                if (energy >= maxEnergy) {
                    //消耗的能量越少,剩下的能量就越多,如果这次剩下了更多地能量,
                    //就说明这一条路消耗的能量更少,就更新路径
                    maxEnergy = energy;
                    updataPath();
                }
                //更新完成路径之后,将此处之前改过的值改回去,在沿着之前的路径往回走
                map[x][y] = 1;
                l.removeLast();
                flag = true;
                return;
            }
        }
        //往上走
        runMap(x - 1, y, energy - 3);
        //往右走
        runMap(x, y + 1, energy - 1);
        //往下走
        runMap(x + 1, y, energy);
        //往左走
        runMap(x, y - 1, energy - 1);
        //如果往上下左右四个方向都走不通,到上一个节点处看能不能往其他方向走
        map[x][y] = 1;
        l.removeLast();
    }
}
