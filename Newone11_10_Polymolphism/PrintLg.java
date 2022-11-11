package Newone11_10_Polymolphism;

public class PrintLg implements PrintTable{
    @Override
    public void print(String doc) {
        System.out.println("From LG Printer");
        System.out.println(doc);
    }
}
