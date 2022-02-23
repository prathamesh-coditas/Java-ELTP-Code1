package Feb23;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Q1 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "Optional Class Example";
        Optional<String> e1= Optional.empty();
        System.out.println(e1);
        Optional<String> v1 = Optional.of(str[5]);
        System.out.println("Filtered value: "+v1.filter((s)->s.equals("Abc")));
        System.out.println("Filtered value: "+v1.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));

        System.out.println("Getting value: "+v1.get());

        System.out.println("Getting hashCode: "+v1.hashCode());

        System.out.println("Is value present: "+v1.isPresent());

        System.out.println("Nullable Optional: "+Optional.ofNullable(str[5]));

        System.out.println("orElse: "+v1.orElse("Value is not present"));
        System.out.println("orElse: "+e1.orElse("Value is not present"));
        v1.ifPresent(System.out::println);
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
        Optional<List<Integer>> listOptional = Optional.ofNullable(l1);
        listOptional.ifPresent(a -> a.forEach(v -> System.out.println(v)));

    }
}  