package Newone11_10_Polymolphism;

public class PrinterMain {
    //interface => 자손이 구현하라
    public static void main(String[] args) {
        String myDoc = "this is a report about ...";
       PrintTable printerS = new PrintSamsung();
       printerS.print(myDoc);
        System.out.println();

        PrintTable printerL = new PrintLg();
        printerL.print(myDoc);
        System.out.println();


    }
}
