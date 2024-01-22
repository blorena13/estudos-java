public class App {
    public static void main(String[] args) throws Exception {
        int x = 7;
        String[] minhaTabuada = new String[10];

        System.out.println("Tabela de multiplicação por " + x);

        for(int i = 1; i <= minhaTabuada.length; i++){
          minhaTabuada[i - 1] = x + " x " + i + " = " + x*i;
        }
        for (String linha : minhaTabuada) {
            System.out.println(linha);
        }
    }
}
