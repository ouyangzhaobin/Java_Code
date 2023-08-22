package com.ouyang.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //2.创建对象，其实就是申明一下，我准备开始用Scanner这个类了。
        Scanner scanner = new Scanner(System.in);
//        byte[] bys = {97, 98, 99};
//        String s3 = new String(bys);
//        System.out.println("s3:" + s3);
//        System.out.println("Hello world!");
//        System.out.println(10);
//        System.out.println("string");
//        int intNum1 = 1;
//        double doubleNum1 = 1.1;
//        char charNum1 = 'a';
//        boolean flag = true;
//        String name = "heimsad";
//        System.out.println(name);
//
//        System.out.println(intNum1);
//        System.out.println(doubleNum1);
//        System.out.println("键盘输入一个整数");
//
//        int number = scanner.nextInt();
//        System.out.println(number);
//        Scanner scanner1 = new Scanner(System.in);
//        double number = 12.2;
//        int c = (int)number;
//        System.out.println(c);
//        System.out.println(1+2+"abc"+1+2);
//        System.out.println('c'+1);
//        int number = 3;
//        if (number > 1) {
//            System.out.println(true);
//        }
//        int number = 10;
//        switch (number) {
//            case 1 : System.out.println("一");
//            case 2 : System.out.println("二");
//            case 3 : System.out.println("三");
//            default : System.out.println("其他");
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        while(number>8){
//            number--;
//            System.out.println(number);
//        }
//        boolean flag = true;
//        if (flag) {
//            System.out.println(flag);
//        }
//        while (number > 7) {
//            number--;
//            System.out.println(number);
//        }
//        String s = new String();
//        Random random = new Random();
//        int number = random.nextInt(10);
//        System.out.println(number);
//        int [] array = new int[2];
//        array[0]=1;
//        array[1]=2;
////        将数组转换为字符串输出
//        System.out.println(Arrays.toString(array));
//        int a = 2;
//        //在main()方法中调用定义好的方法
//        getMax();
//        //构造方法的方式得到对象
//        char[] chs = {'a', 'b', 'c'};
//        String s1 = new String(chs);
//        String s2 = new String(chs);
//
//        //直接赋值的方式得到对象
//        String s3 = "abc";
//        String s4 = "abc";
//
//        //比较字符串对象地址是否相同
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s3 == s4);
//        System.out.println("--------");
//
//        //比较字符串内容是否相同
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s3.equals(s4));
//        System.out.println("--------");
//
//        s3 = s3 + "d";
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s3.equals(s4));
//        ArrayList<String> arrayList = new ArrayList<String>();
//
//        arrayList.add("cde");
//        arrayList.add("cde");
//        arrayList.add("abc");
////      indexOf内部执行比较的是一个equal()函数比较
//        int index = arrayList.indexOf("abc");
//        System.out.println(index);
//        System.out.println(arrayList.get(0).getClass().getName());
////        为了避免ClassCastException的发生，Java提供了 `instanceof` 关键字，给引用变量做类型的校验，格式如下xxxxxxxxxx3 
////        1变量名 instanceof 数据类型
////        2如果变量属于该数据类型或者其子类类型，返回true。
////        3如果变量不属于该数据类型或者其子类类型，返回false。
//        double a = Math.abs(-1.1);
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
//        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
//        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
//        System.out.println(0.09 + 0.01);
//        // 创建两个BigDecimal对象
//        BigDecimal b1 = new BigDecimal("0.3") ;
//        BigDecimal b2 = new BigDecimal("4") ;
//
//        // 调用方法进行b1和b2的四则运算，并将其运算结果在控制台进行输出
//        System.out.println(b1.add(b2));         // 进行加法运算
//        System.out.println(b1.subtract(b2));    // 进行减法运算
//        System.out.println(b1.multiply(b2));    // 进行乘法运算
//        System.out.println(b1.divide(b2));      // 进行除法运算
//        System.out.println(b1.add(b2).getClass().getName());
//        String input1 = "A12345";      // 首字符是字母
//        String input2 = "bs9876543210"; // 首字符是字母
//        String input3 = "123456";      // 首字符是数字
//        String input4 = "0";           // 不符合要求
//        String regex = "[A-Za-z1-9]\\w{5,19}";
//
//        Pattern pattern = Pattern.compile(regex);
//
//        System.out.println(input1.matches(regex)); // 输出：true
//        System.out.println(input2.matches(regex)); // 输出：true
//        System.out.println(input3.matches(regex)); // 输出：true
//        System.out.println(input4.matches(regex)); // 输出：false
//        System.out.println(new Date());
//        System.out.println(new Date(0L));
//        //创建集合对象
//        Map<String,String> map = new HashMap<String,String>();
//
//        //V put(K key,V value)：添加元素
//        map.put("张无忌","赵敏");
//        map.put("郭靖","黄蓉");
//        map.put("杨过","小龙女");
//        //int size()：集合的长度，也就是集合中键值对的个数
//        System.out.println(map.size());
//
//        //输出集合对象
//        System.out.println(map);
//        // 获取所有键的集合。用keySet()方法实现
//        Set<String> keySet = map.keySet();
//        //遍历键的集合，获取到每一个键。用增强for实现
//        for (String key : keySet) {
//            //根据键去找值。用get(Object key)方法实现
//            String value = map.get(key);
//            System.out.println(key + "," + value);
//        }
//        //创建一个数组
//        int[] arr = {2,4,52,2};
//        //根据索引找对应的元素
//        int index = 4;
//        int element = getElement(arr, index);
//
//        System.out.println(element);
//        System.out.println("over");
//        try {
//            System.out.println("Inside try block1");
////            int c1 = 10 / 2;
//            int c2 = 10 / 0;
//            System.out.println("Inside try block2");
//        } catch (Exception e) {
//            System.out.println("Inside catch block");
//        } finally {
//            System.out.println("Inside finally block");
//        }
//
        System.out.println("After try-catch-finally");



    }
    public static void getMax(){
        //方法中定义两个变量，用于保存两个数字
        int a = 10;
        int b = 20;

        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
    public static int getElement(int[] arr,int index){
        //判断  索引是否越界
        if(index<0 || index>arr.length-1){
             /*
             判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
             这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。
              */
            throw new ArrayIndexOutOfBoundsException("哥们，角标越界了```");
        }
        int element = arr[index];
        return element;
    }

}