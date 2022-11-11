package Newone;

import java.util.Scanner;

public class Test1 {
    int num = 0;
    int num2 = 0;
    int num3 = 0;
    double dNum = 0;
    double dNum2 = 0;
    char cNum;
    char cNum2;
    String sNum = "";
    String sNum2 = "";

    public Test1(int math,int science,int english){
        this.num += math;
        this.num += science;
        this.num += english;
    }
    public int average(){
        int sum = num/3;
        return sum;
    }
    public String getGrade(){
        if(90<num/3)
            return "우수입니다.";
        else if(num/3<=90&&num/3>80)
            return "수입니다.";
        else if(num/3<=80&&num/3>70)
            return "평균입니다..";
        else if(num/3<=70)
            return "나가죽습니다.";
        return "응 잘못된 값";
    }
}
