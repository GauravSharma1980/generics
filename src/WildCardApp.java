import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardApp {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);
        List<String> listStr = Arrays.asList("1","2","3");
        printIt(list);
        printIt(listStr);
        System.out.println("===============");
        printItAnotherWay(list);
        printItAnotherWay(listStr);
    }

    private static <T> void printIt(List<T> list) {

        for(T t:list){
            System.out.println(t);
        }

    }

    private static void printItAnotherWay(List<?> list){
        System.out.println("from printItAnotherWay");
        for(Object t: list){
            System.out.println(t);
        }
    }

}
