package week02.WW;

public class w08 {
    public static void main(String[] args) {
        //연산자의 우선순위
        // 산술 > 비교 > 논리 > 대입 이렇게 우선순위가 있다.
        // 단 괄호로 감싸주면 괄호 안의 연산이 최우선순위가 있다.

        int x =2;
        int y = 9;
        int z = 10;
        boolean result = x < y && y < z; //ture
        System.out.println(result);

        result = x + 10 < y && y<z; // f t false
        System.out.println(result);

        result = x + 2 * 3 > y; // false
        System.out.println(result);

        result = (x + 2) * 3 > y; //true
        System.out.println(result);


    }
}
