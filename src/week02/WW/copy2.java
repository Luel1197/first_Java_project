package week02.WW;

public class copy2 {
    public static void main(String[] args) {
        // 깊은 복사

        int[] a = { 1, 2, 3, 4 };
        int[] b = new int[a.length]; //a의 집 크기를 b에게 복사 시킨다.

        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        for (int j = 0; j<b.length; j++){
            System.out.println(b[j]);
        }


        for (int k = 0; k < a.length; k++) {
            b[k] = a[k]; // 깊은 복사
        }

//        for ()

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.

        // 깊은 복사 메서드

        // 1. clone() 메서드
//        int[] a = { 1, 2, 3, 4 };
//        int[] b = a.clone(); // 가장 간단한 방법입니다.
        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!  2차원이란게 뭐냐면
        // 우리가 배운 {1,2,3,4,} 이런거는 배열 안에 어떤 데이터가 들어 가있는데
        // 배열 안에 배열이 들어가있는 경우는 바깥 배열만 방을 만들어 주고 안에는 똑같이 같은 주소값으로 되어있다


    }

}
