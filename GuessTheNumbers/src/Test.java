import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：猜数字游戏
        guessNumber();
    }
    public static void guessNumber(){
        //1.产生一个随机数: 1-100之间
        //方式一：
        // Math.random() 生成[0.0,1.0)区间的随机双精度浮点数
        // Math.random() * 100 将范围扩展为[0.0,100.0)
        // Math.random() * 100 + 1 将范围平移至[1.0,101.0)
        // (int) 将浮点数向下取整，得到一个整数，即强制类型转换，结果为[1,100]
//        int number = (int)(Math.random() * 100 + 1);
        // System.out.println(number);

        //方式二：
        Random random = new Random();
        // nextInt(int bound) 生成[0,bound)区间的随机整数(即0到99)且bound必须为正整数，否则抛出illegalArgumentException异常
        int luckNumber = random.nextInt(100) + 1;

        //2.循环提示用户输入数字，并判断用户输入的数字和随机数是否相等，相等则结束循环，不相等则继续循环
        Scanner scanner = new Scanner(System.in);
        while (true){
            //3.让用户输入猜测的数字
            System.out.println("请输入一个1-100的数字：");
            int guessNumber = scanner.nextInt();
                if (guessNumber == luckNumber){
                    System.out.println("恭喜你，猜对了！");
                    break;
                }else if (guessNumber > luckNumber){
                    System.out.println("你猜的数字大了");
                }else {
                    System.out.println("你猜的数字小了");
                }
            }
        }
    }
