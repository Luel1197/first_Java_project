package week02.WW;

import java.util.Scanner;

public class w17 {
    public static void main(String[] args) {
        //입력받는 단을 제외하고 출력
        Scanner sc = new Scanner(System.in);
        int put = sc.nextInt(); //출력 제외 단 값
        //구구단
        for (int i = 2; i<=9; i++){ //구구단 앞에 수
            if (i != put){
                break;
            }
            for (int j = 2; j<=9; j++){//구구단 뒤에 수
                System.out.println(i + " X " + j + " = " + (i*j));

            }
        }
    }
}
