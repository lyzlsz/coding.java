package com.bittech;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/7/8 0008
 * @Author:weiwei
 **/
public class Error {
    public static class Errors {
        private String name;
        private int line;
        private int count;

        @Override
        public String toString() {
            return name + " " + line + " " + count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Error> errors = new ArrayList<>();
        while (sc.hasNext()) {
            String name = sc.next();
            int num = sc.nextInt();
            Error record = new Error();
            name = name.substring(name.lastIndexOf("\\") + 1);
            if (name.length() > 16) {
                name = name.substring(name.length() - 16);
            }
//            boolean flag = true;
//            for (Error error : errors) {
//                if (name.equals(error.name) && num == error.line) {
//                    error.count++;
//                    flag = false;
//                }
//            }
//            if (flag) {
//                record.name = name;
//                record.line = num;
//                record.count = 1;
//                errors.add(record);
//            }
//        }
            sc.close();
            int j = 0;
            if (errors.size() > 8) {
                j = errors.size() - 8;
            }
            for (; j < errors.size(); j++) {
                System.out.println(errors.get(j));
            }
        }
    }
}

