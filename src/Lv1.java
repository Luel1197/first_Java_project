import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Queue<Integer> qresult = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in); //스캔

        while (true) {
            // 숫자 1 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            // 숫자 2 입력
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // 사칙연산 입력
            System.out.print("사칙연산 기호를 입력하세요: ");
            char cal = sc.next().charAt(0);

            // 입력 받은 값 연산
            int result = 0;

            switch (cal) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("오류발생.");
            }

            //연산 값 출력
            System.out.println(result);

            qresult.add(result);

            //가장 최근값 삭제
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String del = sc.next();
            if ("remove".equals(del)){
                qresult.poll();
            }

            //모든 값 조회
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String all = sc.next();
            if ("inquiry".equals(all)){
                for(int one: qresult) {
                    System.out.println(one + " ");
                }
            }

            //종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String ex = sc.next();
            if ("exit".equals(ex)) {
                break;
            }
        }

    }
}
