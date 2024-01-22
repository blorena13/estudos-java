public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        String[] minhaPiramide = new String[x];

        for (int i = 1; i <= x; i++) {
            StringBuilder linha = new StringBuilder();
            
            for (int j = 1; j <= i; j++) {
                linha.append(i);
            }

            minhaPiramide[i - 1] = linha.toString();
        }

        for (String linha : minhaPiramide) {
            System.out.println(linha);
        }
    }
}
