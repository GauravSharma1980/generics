import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyValuesUsingWildCard {

    public static <T> List<? super T> copyAll(List<? extends T> source, List<? super T> destination ){
          for(int i =0;i<source.size();i++){
              destination.add(source.get(i));
          }
          return destination;
    }
    public static void main(String[] args) {
        List sourceStrList = Arrays.asList("a","b","c");
        List<String> destinationStrList = new ArrayList<>();
        List<String> lstout1 = copyAll(sourceStrList,destinationStrList);

        System.out.println(lstout1);
        List sourceStrList1 = Arrays.asList(1,2,3,4);
        List<Integer> destinationStrList1 = new ArrayList<>();
        List<Integer> listout2 = copyAll(sourceStrList1,destinationStrList1);
        System.out.println(listout2);
    }
}
