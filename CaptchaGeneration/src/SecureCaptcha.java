import java.security.SecureRandom;

public class SecureCaptcha {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {
        System.out.println(generateCode(6));
    }

    public static String generateCode(int length){
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int type = RANDOM.nextInt(3);
            switch(type) {
                case 0 -> code.append(RANDOM.nextInt(10));
                case 1 -> code.append((char)(RANDOM.nextInt(26) + 'A'));
                case 2 -> code.append((char)(RANDOM.nextInt(26) + 'a'));
            }
        }
        return code.toString();
    }
}
