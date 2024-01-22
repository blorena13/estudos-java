public class App {
    public static void main(String[] args) throws Exception {
        int num = 9;
        if (num % 2 == 0 && num > 0) {
            System.out.println(num + " é par e positivo");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println(num + " é par e negativo");
        } else if (num % 2 != 0 && num < 0) {
            System.out.println(num + " é ímpar e negativo");
        } else {
            System.out.println(num + " é ímpar e positivo");
        }
    }
}
