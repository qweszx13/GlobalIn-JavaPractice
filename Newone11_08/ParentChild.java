package Newone11_08;

public class ParentChild extends Parent {
    private String androver;

    public ParentChild(String num,String ver){
        super(num);
        androver = ver;
    }
    public void playApp(){
        System.out.println("App is running in "+androver);
    }
}
