package week02.WW;

public class w16 {
    public static void main(String[] args) {
        //while
//        int num = 0;
//        while (num < 3) { //괄호안의 조건 동안 안의 명령어들을 수행한다. //그래서  반복할 부분에 증감 수식을 포함하지 않으면 무한루프에 빠지게 된다.
//
//            num++;
//            System.out.println(num + " 출력");
//
//        }


//        //do ~ while
//        int num1 = 4;
//        do {
//            System.out.println(num1);
//        } while(num1 < 3);


        //break(깨부수다)
        // 가장 가까운 for문 , while , do while switch 문을 중단 시킨다.

//        int num = 0;
//        while (num<3){
//            num++;
//            if (num == 2){
//                break;
//            }
//            System.out.println(num + "출력");
//        }

//        for (int i =0; i<10; i++) {
//            System.out.println("i=" + i);
//            if (i == 2){
//                break;
//            }
//            for (int j = 0; j<10; j++){
//                System.out.println("j=" + j);
//                if (j == 2){
//                    break;
//                }
//            }

        int num = 0;
        while (num < 3){
            num++;
            if (num == 2 ) {
                continue;
            }
            System.out.println(num);
        }
    }
}
