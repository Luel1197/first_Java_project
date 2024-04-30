

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //스캔
        Calculator c = new Calculator();
//        Calculator AAA = new Calculator();

            while (true) {
                System.out.print("사칙 or 원? ");
                String rufwjd = sc.next();

                if ("원".equals(rufwjd)) {
                    System.out.print("원의 반지름을 입력하세요 ");
                    double radius = sc.nextDouble();
                    c.setRadius(radius);
                    c.Area();
                    System.out.println(c.getAr());

                } else if ("사칙".equals(rufwjd)) {
                    // 숫자 1 입력
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int num1 = sc.nextInt();

                    // 숫자 2 입력
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int num2 = sc.nextInt();

                    // 사칙연산 입력
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char cal = sc.next().charAt(0);


                    c.setVal(num1, num2, cal);

                    //연산
                    c.calculate();

                    //출력
                    System.out.println(c.getResult());
                } else {
                    System.out.println("오류입니다.");
                }


                //가장 최근값 삭제
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String del = sc.next();

                if ("remove".equals(del)){
                    c.removeResult();
                }

                //모든 값 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String al = sc.next();

                if ("inquiry".equals(al)){
                    c.all();
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

