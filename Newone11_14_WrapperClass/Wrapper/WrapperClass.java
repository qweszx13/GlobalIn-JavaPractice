package Newone11_14_WrapperClass.Wrapper;

public class WrapperClass {
    public static void showData(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Integer iInst = new Integer(3);//원래는 객체가 들어가 sout될경우 주소가 나와야하지만
        // WrapperClass 들 안에는 toString이 오버라이딩되어있기때문에 값이 출력됨
        showData(iInst);
        showData(new Double(3.14));

        Integer.parseInt("123455");

    }
}
