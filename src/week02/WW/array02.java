package week02.WW;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array02 {
    public static void main(String[] args) {
        //초기화
        //1. 배열의 특정값을 지정해서 초기화 가능

//        String[] starray = {"a", "b", "c", "d"};

        // 2. for문을 통해서 대입
//        for (int i = 0; i < intarray.length; i++){
//            intarray[i] = i;
//        }
//        //다건 출력
//
//        for (int i=0; i<intarray.length; i++){
//            System.out.println(intarray[i]);
//        }

        //향상된 for.
        int[] intarray = {10,20,30,40,50};
//
//        for (int i: intarray){
//            System.out.println(i);

        //배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intarray, 1);
        for (int i: intarray){
            System.out.println(i);
        }
    }
}
