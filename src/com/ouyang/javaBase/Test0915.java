package com.ouyang.javaBase;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;
/**
 * @author ouyang
 * @date 2023/9/15 22:28
 */
public class Test0915 {
    public static void main(String[] args) {
        long  mk = (long) Math.pow(10.0,9.0)+7;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] array = new int[k][2];

        // 读入数据
        for (int i = 0; i < k; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }

        int res = 0; // 计算的结果
        int countSum = (int) Math.ceil(Math.log(n) / Math.log(2)) - 1; // 总共的次数
        int index = 0; // 分组的索引
        int i1 = 0; // 遍历的第几行
        int j1 = 0; // 遍历的第i行的j1号数据
        int x; // 一组当中的第一个数
        int y; // 一组当中的第二个数
        boolean flag = false;
        while(i1 < k){
            int countTemp = array[i1][0]; // 当前行有countTemp个数据
            j1 = flag?1:0;
            flag = false;
            while(j1 < countTemp){
                // 该行未取完
                x = array[i1][1];
                index++;
                if(j1 != countTemp - 1){ // 可以从改行取第二个数
                    y = array[i1][1];
                    index++;
                    int number = countSum - (int) Math.ceil(Math.log(index / 2) / Math.log(2));
                    res += (int) (( (((int) (x % mk)  * (int) (number % mk)) % mk) + (((int) (y % mk)  * (int) (number % mk)) % mk))%mk);
                    j1++;
                }else{ // 不可以从该行取第二个数
                    if(i1 != k - 1){ // 可以从下一行取第二个数
                        y = array[i1+1][1];
                        flag = true;
                        index++;
                        int number = countSum - (int) Math.ceil(Math.log(index / 2)/Math.log(2));
                        res += (int) (( (((int) (x % mk)  * (int) (number % mk)) % mk) + (((int) (y % mk)  * (int) (number % mk)) % mk))%mk);
                    }else{ // 不可以从下一行取第二个数，x为独立的一个数字
                        y = 0;
                        index++;
                        int number = countSum - (int) Math.ceil(Math.log(index / 2) / Math.log(2));
                        res += (int) (( (((int) (x % mk)  * (int) (number % mk)) % mk) + (((int) (y % mk)  * (int) (number % mk)) % mk))%mk);
                    }
                }
                j1++;
            }
            i1++;
        }
        System.out.println(res);

    }
}
/*
10
6
5 5
1 1
1 2
1 3
1 4
1 5
 */
/*
5 5
1 1
1 2
1 3
1 4
1 5

 */
/*
12 12
1 1
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
1 11
1 12


 */
