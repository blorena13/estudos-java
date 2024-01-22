public class App {
    public static void main(String[] args) throws Exception {
        int x = 10;
        int[] fibonacci = new int[x];

        for (int i = 0; i < x; i++) {
            if(i == 0) {
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.print(fibonacci[i] + " ");
        }  
    }
}
