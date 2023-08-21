import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
//        indexOf内部执行比较的是一个equal()函数比较
//        int index = arrayList.indexOf("abc");
//        System.out.println(index);
//        System.out.println(arrayList.get(0).getClass().getName());


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

}