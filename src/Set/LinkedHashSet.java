package Set;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {

        // Mantém a ordem que os elementos foram adicionados, velocidade intermediária
        Set<String> set = new java.util.LinkedHashSet<>();

        // Adiciona o elemento ao set
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        //Remove o elemento do set
        set.remove("TV");

        //Remove se a condição for obedecida
        set.removeIf(x -> x.length() <= 6);

        //Verifica se o elemento está contido no set
        set.contains("Notebook");

        for(String p : set) {
            System.out.println(p);
        }
    }
}