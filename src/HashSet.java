import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        // Mais rápido de todos, mas não garante ordem
        Set<String> set = new java.util.HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for(String p : set) {
            System.out.println(p);
        }
    }
}