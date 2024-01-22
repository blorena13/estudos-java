import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] frutas1 = {"morango", "banana", "uva", "melancia"};
        String[] frutas2 = {"melancia", "maça", "morango", "kiwi", "acerola"};
        List<String> meuArrayFinal = new ArrayList<>();

        for(String fruta : frutas1) {
          if(contains(frutas2, fruta)){
            meuArrayFinal.add(fruta);
          }
        }
        for(String elemento : meuArrayFinal){
            System.out.println(elemento);
        }

    }

    private static boolean contains(String[] array, String value){
        for(String element : array){
            if(element.contains(value)){
                return true;
            }
        }
        return false;
    }
}
