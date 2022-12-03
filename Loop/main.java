// Java 프로그래밍 - 반복문

public class Main {
    public static void main(String[] args) {

//      1. 반복문 - for
        System.out.println("== for ==");
//      1-1. 기본 사용 방법
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // continue
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 2){
                continue;
            }

            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //--E

        // break
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 2){
                break;      // 탈출 - 별 2개까지 밖에 나오지 않음
            }
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //--E

//      1-2. for each
        System.out.println("== for each ==");
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }

        // 위 for문과 동일한 로직
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        // for each (대상 자료형 + 변수 : 반복하고자 하는 대상) - 모든 원소를 순회
        for (int num : nums) {
            System.out.println(num);
        }

//      2. 반복문 - while
        System.out.println("== while ==");

//      2-1. while
        int i = 0;
        while (i < 5) {
            System.out.println(i++);
        }

        System.out.println();
        i = 0;

        while (i < 5) {
            if (i == 2) {
                i++;
                continue;           // i가 2일 때는 2를 출력하지 않고 넘어감
            }
            System.out.println(i++);
        }

        System.out.println();
        i = 0;

        while (i < 5) {
            if (i == 2) {
                i++;
                break;
            }
            System.out.println(i++);
        }

//      2-2. do-while
        System.out.println("== do-while ==");
        boolean knock = false;
        do {
            System.out.println("knock");
        } while(knock);

        System.out.println("== Q1 ==");

//      아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력하기
//      *
//      ***
//      *****
//      *******

        // 2로 나눈 나머지가 1인 경우 조건에 만족하는 별모양을 표시
        for (int ii = 0; ii < 7; ii++) {
            if (ii % 2 == 1) {
                continue;
            }
            for (int j = 0; j < ii + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // End

        // 다른 풀이 -> 2로 나눈 나머지가 0일 때
        for (int l = 0; l < 8; l++) {
            if (l % 2 == 0) {
                continue;
            }

            for (int k = 0; k < l; k++) {
                System.out.print("*");
            }
            System.out.println();
        } // End

        System.out.println("== Q2 ==");
//      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        int waterTemperature = 0;
        int Temp = waterTemperature;

        // 무한루프로 구성 후 조건문 구성하여 물 온도 출력
        while(true){
            Temp++;
            if (Temp % 10 == 0 && Temp != 100) {
                System.out.println("물 온도는 " + Temp + " 입니다.");
            } else if(Temp == 100) {
                System.out.println("물 온도는 " + Temp + " 입니다.");
                break;
            }
        }

        // 다른 풀이
        while (waterTemperature < 100) {
            waterTemperature++;

            if (waterTemperature % 10 == 0) {
                System.out.println(waterTemperature + "도 입니다.");
            }
        }

    }
}
