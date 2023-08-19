import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2.创建对象，其实就是申明一下，我准备开始用Scanner这个类了。
        Scanner scanner = new Scanner(System.in);

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