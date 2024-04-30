package week02.WW;

public class copy01 {
    public static void main(String[] args) {
        //얕은 복사
        // 얕은복사는 말그대로 집 비밀번호 공유 같다고 말할 수 있음
        // 따로 나의 공간을 만드는 것이 아닌 복사한 대상의 방에 들어가서 그 값을 가져오기 때문에
        // 그 값을 바꾸면 복사한 대상의 값도 바뀜
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;

        //arr2 확인
        System.out.println(arr2);
        for (int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

         arr2[2] = 5;

        System.out.println(arr1);
        for (int i=0; i<arr2.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println(arr2);
        for (int j=0; j<arr2.length; j++){
            System.out.println(arr2[j]);
        }

    }
}
