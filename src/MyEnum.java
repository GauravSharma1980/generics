import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;


public enum MyEnum {

    TOKEN_RESPONSE("TokenResponse"),
    AUTH_RESPONSE("AuthResponse"),
    SALE_RESPONSE("SaleResponse");


    private final String value;

    public String getValue(){
        return value;
    }
    MyEnum(String displayName) {
        this.value = displayName;
    }

}

class MyEnumTest{

    public static void main(String[] args) {

        List<MyEnum> values = Arrays.asList(MyEnum.values()).stream().toList();
        List<String> list = values.stream().map(MyEnum::getValue).toList();
        System.out.println(list);

        try {
            Method method = MyEnum.class.getMethod("values");
            Object object = method.invoke(null);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}