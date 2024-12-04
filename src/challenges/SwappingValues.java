package challenges;

public class SwappingValues {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        firstLogicUsingTempVariable(a,b);

        secondLogicUsingOperators(a,b);

        thirdLogicUsingOperators(a,b);
    }

    private static void thirdLogicUsingOperators(int a, int b) {
        System.out.println("the values before swapping from thirdLogicUsingOperators"+ a +"**"+ b );
        a = a* b;
        b = a/b;
        a = a/b;
        System.out.println("the values after swapping from thirdLogicUsingOperators"+ a +"**"+ b );
    }

    private static void secondLogicUsingOperators(int a, int b) {
        System.out.println("the values before swapping from secondLogicUsingOperators"+ a +"**"+ b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("the values after swapping from secondLogicUsingOperators "+ a +"**"+ b );
    }

    private static void firstLogicUsingTempVariable(int a, int b) {
        System.out.println("the values before swapping from firstLogicUsingTempVariable"+ a +"**"+ b );
        int temp=0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("the values after swapping from firstLogicUsingTempVariable"+ a +"**"+ b );
    }
}
