public class GenericClass {

    //void return type
    public <T> void showMe(T item){
        System.out.println("the item is "+item);
    }

    //return type T
    public <T> T showMeAndReturn(T item){
        System.out.println("the item is "+item);
        return item;
    }

    public <T,V> void itemsWithMultipleParams(T t, V v){
        System.out.println("the items are "+ t + "***" + v );
    }

    public <T> void itemsOfArray(T[] arr){
        for(T t:arr){
            System.out.println(t);
        }
    }

    public <T> boolean checkEquality(T val1, T val2){
        if(val1 == val2)
            return true;
        else
            return false;
    }

    public <T> boolean checkEquality1(T val1, T val2){
        if(val1.equals(val2))
            return true;
        else
            return false;
    }

    public <T extends Comparable<T>> T compareItems(T item1, T item2){
        if(item1.compareTo(item2) < 0)
            return item1;
        else
            return item2;
    }

    public <T extends Number> double add(T num1, T num2){
        return num1.doubleValue()+num2.doubleValue();
    }

    public <T extends Number> int countGreaterItems(T[] items, T item){
        int k = 0;
        for(T t: items){
            if(item.intValue() < t.intValue()){
                ++k;
            }
        }
        return k;
    }


    public <T extends Comparable<T> > int countGreaterItemsUsingComparable(T[] items, T item){
        int k=0;
        for(T t : items){
            if(t.compareTo(item) == 1){
                ++k;
            }
        }
        return k;
    }
}
