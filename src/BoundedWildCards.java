import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;




public class BoundedWildCards {


    public static <T extends Shape> void drawAll(List<T> shape) {
        for (T sp : shape) {
            sp.draw();
        }
    }

    public static void showAll(List<? super Serializable> element) {
            for(Object number:element){
                System.out.println(number);
            }
    }

    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o.toString());
        }

    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        print(nums);

        List<Rectangle> rectangleShape = new ArrayList<>();
        rectangleShape.add(new Rectangle());
        drawAll(rectangleShape);
        print(nums);

        List<? super Integer> list1 = new ArrayList<Integer>();
        List<? super Integer> list2 = new ArrayList<Number>();
        List<? super Integer> list3 = new ArrayList<Object>();

    }
}