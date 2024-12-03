import java.util.ArrayList;
import java.util.List;

//example of type inference....
public class App<T> {

    static <T> List<T> add(List<T> list , T item1 , T item2){
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static void main(String[] args) {
        List<String> lst = add(new ArrayList<>(),"gaurav","saurav");
        System.out.println(lst);

        List<Integer> lst2 = add(new ArrayList<>(),23,45);
        System.out.println(lst2);
    }
}
