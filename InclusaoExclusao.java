import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InclusaoExclusao {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<List<Integer>> sets = new ArrayList<>();

            System.out.println("Quantos conjuntos você deseja?");
            int quantitySets = sc.nextInt();

            for (int indexSets = 0; indexSets < quantitySets; indexSets++) {
                List<Integer> set = new ArrayList<>();

                System.out.println("Quantos valores você deseja colocar no " + (indexSets + 1) + "° Conjunto?");
                int quantityValues = sc.nextInt();
                for (int indexValues = 0; indexValues < quantityValues; indexValues++) {
                    System.out.println("Digite o valor: ");
                    int value = sc.nextInt();
                    set.add(value);
                }
                sets.add(set);
            }

            int quantityElements = calcularquantityElementosUniao(sets);
            System.out.println("A quantidade de elementos na união dos conjuntos é: " + quantityElements);
        }
    }

    public static int calcularquantityElementosUniao(List<List<Integer>> sets) {
        int n = sets.size();
        int totalElementos = 0;

        for (int i = 0; i < n; i++) {
            totalElementos += sets.get(i).size();
            System.out.println(sets.get(i).size());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                List<Integer> intersecao = new ArrayList<>(sets.get(i));
                intersecao.retainAll(sets.get(j));
                totalElementos -= intersecao.size();
                System.out.println(intersecao.size());
            }
        }

        return totalElementos;
    }
}