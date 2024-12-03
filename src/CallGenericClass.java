public class CallGenericClass {

    public static void main(String[] args) {

        GenericClass genericClass = new GenericClass();
        genericClass.showMe("Hello Gaurav");

        genericClass.showMe(89.90);

        System.out.println(genericClass.showMeAndReturn("Hello Gaurav"));
        System.out.println(genericClass.showMeAndReturn(899.90));

        genericClass.itemsWithMultipleParams(10,"10 in String");

        genericClass.itemsOfArray(new Integer[]{1,2,3});

        genericClass.itemsOfArray(new String[]{"str1","str2"});

        System.out.println(genericClass.checkEquality("4","4"));

        System.out.println(genericClass.checkEquality1("4","9"));

        System.out.println("compare result"+genericClass.compareItems(4,5));

        System.out.println("compare result"+genericClass.compareItems("Anil","Kevin"));

        System.out.println("compare result"+genericClass.compareItems(9.5,5.7));

        System.out.println("compare result"+ genericClass.compareItems(new Person("gaurav","sharma",10),new Person("anil","sharma",5)));

        System.out.println("count"+genericClass.countGreaterItems(new Integer[]{1,2,3,4,5},2));


        //System.out.println("count"+genericClass.countGreaterItems(new String[]{"1","2","3","4","5"},"2"));


        System.out.println("count using compare"+genericClass.countGreaterItemsUsingComparable(new String[]{"1","2","3","4","5"},"2"));

        System.out.println("count using compare"+genericClass.countGreaterItemsUsingComparable(new Integer[]{1,2,3,4,5},2));




    }
}
