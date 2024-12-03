

public class GenericSum{

    public <T extends  Number> double getSum(T val1, T val2){
        return val1.doubleValue() + val2.doubleValue();
    }

    public static void main(String[] args) {
        GenericSum genericSum  = new GenericSum();
        System.out.println(genericSum.getSum(2,3));

        System.out.println(genericSum.getSum(2.2,4.5));

        System.out.println(genericSum.getSum(1.2F,3.4F));



    }
}

