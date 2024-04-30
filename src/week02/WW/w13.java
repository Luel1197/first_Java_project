package week02.WW;

import java.util.Objects;
import java.util.Scanner;

public class w13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A 입력");
        String aHand = sc.nextLine();

        System.out.println("b 입력");
        String bHand = sc.nextLine();

        if (Objects.equals(aHand,  "가위")) {
            if (Objects.equals(bHand,  "가위")){
                System.out.println("비겼습니다.");
            } else if (Objects.equals(bHand,  "바위")){
                System.out.println("b가이겼습니다.");
            } else if (Objects.equals(bHand,  "보")){
                System.out.println("a가이겼습니다.");
            }  else {
                System.out.println("b가 병신입니다..");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")){
                System.out.println("a가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")){
                System.out.println("비겼습니다.");
            } else if (Objects.equals(bHand, "보")){
                System.out.println("b가이겼습니다.");
            }  else {
                System.out.println("b가 병신입니다..");
            }

        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")){
                System.out.println("b가이겼습니다.");
            } else if (Objects.equals(bHand, "바위")){
                System.out.println("a가 이겼습니다.");
            } else if (Objects.equals(bHand, "보")){
                System.out.println("비겼습니다.");
            }  else {
                System.out.println("b가 병신입니다.");
            }
        } else {
            System.out.println("a가 병신입니다.");
        }
    }
}
