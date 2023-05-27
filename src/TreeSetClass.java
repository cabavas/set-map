import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        //Mais lento, ordena os elementos em uma árvore rubro-negra
        //Para ordenarmos o TreeSet é preciso que a classe implemente a Comparable
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}