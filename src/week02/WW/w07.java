package week02.WW;

public class w07 {
    public static void main(String[] args) {
        //기타 연산자
        //(1) 형변환 연산자
        int intnum = 93 + (int) 98.8;
        System.out.println(intnum);

        double donum = (double) 93 + 98.8;
        System.out.println(donum);

        //(2) 삼항연산자
        //비교연산자와 항상 함께 쓰인다.
        //조건 ? 참 : 거짓
        int x = 1;
        int y = 9;
        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);

        int max = (x>y) ? x:y;
        System.out.println(max);

        //(3) instance of (3주차에 클래스 객체를 배울때 추가 설명)
        // 피 연산자가 조건에 명시된 클래스의 객체인지 비교하여
        //맞으면 트루
        //틀리면 펄스
    }
}
