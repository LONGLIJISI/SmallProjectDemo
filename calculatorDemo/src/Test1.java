import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //目标：简易版计算器开发
        //1.键盘录入两个整数，以及运算符
        Scanner sc = new Scanner(System.in);//创建一个Scanner对象，用于标准输入流（键盘）读取数据
        System.out.println("请输入第一个数字：");
        double num1 = sc.nextDouble();//等待用户输入一个双精度浮点数，如非数字内容则会抛出inputMismatchException异常
        System.out.println("请输入第二个数字：");
        double num2 = sc.nextDouble();
        System.out.println("请输入运算符：+，-, *，/");
        String operator = sc.next();

        //2.把这个数据交给一个独立的计算方法，帮我计算结果并返回给我
        double result = calculate(num1, num2, operator);
        System.out.println("计算结果为：" + result);
    }

    //定义一个静态方法calculate，可直接通过类名，如Test1.calculate(1,2,"+")调用。
    public static double calculate(double num1, double num2, String operator) {
        double result = 0;//初始化结果为0.0，确保未匹配到任何运算符时返回默认值。
        switch(operator){
            case"+" -> result = num1 + num2;
            case"-" -> result = num1 - num2;
            case"*" -> result = num1 * num2;
            case"/" -> {
                if(num2 == 0){
                    //该异常继承自RuntimeException，属于非受检异常，适用于参数值不符合方法约定时的场景，如除数不能为0、运算符无效。
                    throw new IllegalArgumentException("除数不能为0！");
                }
                result = num1 / num2;
            }
            default -> throw new IllegalArgumentException("无效运算符：" + operator);
        }
        return result;
    }
}
