package Newone11_14_TryCatch.ClassCastExcep;

public class ClassCast {
    public static void main(String[] args) {
        Board pbd1 = new PBoard();
        PBoard pbd2 = (PBoard)pbd1;

        System.out.println(".. intermediate location...");

        Board ebd1 = new Board();
        try {
            PBoard ebd2 = (PBoard)ebd1;
        }catch (ClassCastException e){
            System.out.println("에러임ㅇㅇ "+ e.getMessage());
        }


    }
}
