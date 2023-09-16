package com.ouyang.javaBase;

import java.util.Scanner;

/**
 * @author ouyang
 * @date 2023/9/16 0:05
 */
public class Test0916 {
    public static void main(String[] args) {
        long  mk = (long) Math.pow(10.0,9.0)+7;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] array = new int[k][2];
        int countSum = (int) Math.ceil(Math.log(n) / Math.log(2)) - 1;
        int res = 0;
        // 读入数据
        for (int i = 0; i < k; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }

        long index = 1;
        long indexTemp = 0;
        long sumTemp = 0;
        long cur = 2;
        long m;
        long need = 2;
        for (int i = 0; i < k; i++) {
            long temp = array[i][0]; // 当前有temp个数据
            indexTemp += temp;
            long shenxia = temp;
            int number = countSum - (int) Math.ceil(Math.log(cur / 2)/Math.log(2));
            while(indexTemp >= cur) {
                res += (array[i][1] * need) * number;
                shenxia -= need;
                need = cur;
                cur *= 2;
                number = countSum - (int) Math.ceil(Math.log(cur / 2)/Math.log(2));
            }if(shenxia > 0){
                res += (array[i][1] * shenxia) * number;
                need -= shenxia;
            }

        }
        System.out.println(res);
    }
}
