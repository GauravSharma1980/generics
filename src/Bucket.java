import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bucket <T>{

    private T item;
    private List<T> list = new ArrayList<>();

    public void addItem(T item){
        list.add(item);
    }

    public List<T> getItem(){
        return list;
    }

    public static void main(String[] args) {

        Bucket<String> bucket = new Bucket<>();
        bucket.addItem("1bucket");
        bucket.addItem("2bucket");
        bucket.addItem("3bucket");
        bucket.addItem("4bucket");

        List<String> item1 = bucket.getItem();
        System.out.println(item1);

        Bucket<Integer> integerBucket = new Bucket<>();
        integerBucket.addItem(1);
        integerBucket.addItem(2);
        integerBucket.addItem(3);
        integerBucket.addItem(4);

        List<Integer> item2 = integerBucket.getItem();
        System.out.println(item2);


    }


}
