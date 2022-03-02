package Feb23;
/*abstract class CalculateAble<T>{
    abstract T add(T a, T b);

}

public class Main {

    public static void main(String[] args) {
        CalculateAble<Integer> a = new CalculateAble<Integer>() { // diamond operator is empty
            public Integer add(Integer a, Integer b){
                return a+b;
            }
        };
        int result = a.add(10, 20);
        System.out.println(result);
    }
}*/

import java.util.stream.Collectors;

public class Feb23 {

    void show(){
        var name="Prathamesh";;
        var lname="Chaudhari";
        System.out.println("Name is::"+name);
        System.out.println(name+" "+lname);
    }
    public static void main(String[] args) throws Exception {

        String str = "JD\nJD\nJD";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
        System.out.println("***********VAR***********");
        Feb23 obj_m=new Feb23();
        obj_m.show();
    }
}