import java.security.SecureRandom;

public class Text {
    public static void main(String[] args) {
        // 目标：开发验证码
        // 1.调用一个方法返回执行位数的验证码，每位只能是数字或者大写字母或者小写字母
        System.out.println(getCode(4));
        System.out.println(getCode(6));
    }
    public static String getCode(int n) {
        // 2.定义一个String类型变量，用于存储验证码
        String code = "";
        // 3.定义一个循环，循环n次，每次生成一个验证码
        for (int i = 0; i < n; i++) {
            // 4.在当前位置生成一个数字或者大写字母或者小写字母。
            int type = (int) (Math.random() * 3);
            // 5.使用switch判断当前位置随机的字符类型。
            switch(type) {
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    char ch = (char) (Math.random() * 26 + 'A');
                    code += ch;
                    break;
                case 2:
                        char ch2 = (char) (Math.random() * 26 + 'a');
                        code += ch2;
                    break;
            }
       }
        return code;
    }
}
