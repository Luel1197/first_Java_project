package week02.WW;

public class w18 {
    public static void main(String[] args) {
        //배열
        //배열 선언 int[] intarray;  <== 정수형 배열   (int intarr[]; <== 변수명 뒤에 붙여도 생성 가능)

        //배열 생성 int array[] = new int[8] ;  <== 배열 선언  = 배열 생성    ,   8은 이제 인트형 칸을 0~7 까지 만들겠다.

        //배열생성
        int[] intarray = new int[3]; //{0,0,0}
        boolean[] booleanarray = new boolean[3]; //{false,false,false}
        String[] starray = new String[3]; //{"","","",}

        // 이렇게도 가능합니다. 배열 선언 먼저 -> 나중에 생성
        int[] intarray2;
        intarray2 = new int[3];

        // 이렇게 생성한 배열들을 순회 할 수 있다. (배열의 값을 하나씩 뽑아서 조회 할 수 있다.)

        // 1. 배열의 특정 부분을 꺼내고 싶다.
        System.out.println(intarray[1]);

        // 2.  여러 부분을 꺼내고 싶다. //intarray2.length <== 앞의 변수의 길이를 구하는 매서드
        for (int i = 0; i < intarray2.length; i++) {
            System.out.println(intarray2[i]);
        }
    }
}
