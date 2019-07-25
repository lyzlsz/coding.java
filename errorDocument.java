package Test0724;

import java.util.*;

/**
 * package:Test0724
 * Description:TODO
 *
 * @date:2019/7/25
 * @Author:weiwei
 **/
public class errorDocument {
    private static int errorItems = 0;

    private static void RecordingErrorLogs(Map<String, Integer> map, String fileLocation, int lineNum) {
        //input[0]文件路径 input[1]行号
        String[] arr = fileLocation.split("\\\\");
        String fileName = arr[arr.length - 1];
        if (fileName.length() > 16) {
            fileName = fileName.substring(fileName.length() - 16);
        }
        //2.将文件路径和行号连接转为字符串,作为map的key键值
        String inputStr = fileName + " " + lineNum;

        //3.验证:对相同的错误记录只记录一条,错误计数增加
        if (map.containsKey(inputStr)) {
            map.put(inputStr, map.get(inputStr) + 1);
        } else {
            //没有重复的,次数就设置为1
            map.put(inputStr, 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //不需要排序,所以使用LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        while (sc.hasNext()) {
            String fileLocation = sc.next();
            int lineNum = sc.nextInt();
            //输入一条信息,记录一条
            RecordingErrorLogs(map, fileLocation, lineNum);
        }
        //遍历map的key键值,输出最后的八条记录
        int count = 0;
        for (String s : map.keySet()) {
            count++;
            if (count > map.size() - 8) {//从倒数第八条开始遍历
                System.out.println(s + " " + map.get(s));//文件路径行号+个数
            }
            sc.close();
        }
    }
}
