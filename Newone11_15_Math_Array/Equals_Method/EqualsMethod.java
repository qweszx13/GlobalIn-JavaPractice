package Newone11_15_Math_Array.Equals_Method;

public class EqualsMethod {
    public static void main(String[] args) {

        String str1 = new String("AAA");
        String str2 = new String("AAA");

        System.out.println(str1.equals(str2));

        INum INum1 = new INum(3);
        INum iNum2 = new INum(3);
        System.out.println(INum1.equals(iNum2));
    }
}
