public class primeNumberDemo {
    public static void main(String[] args) {
        // 目标：找出101 - 200之间所有的素数
        int count = 0;
        for (int i = 101; i < 200; i++) {
            //每遍历一个数字，判断该数是否为素数，是则输出，否则反之。
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数的个数为：" + count);
    }

    public static boolean isPrime(int num) {
        //判断一个数是否为素数
        for (int i = 2; i < num/i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
