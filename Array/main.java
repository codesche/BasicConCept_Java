
public class Main {
    public static void main(String[] args) {

        // 1. one-dimensional array
        System.out.println("== 일차원 배열 ==");
        
        int[] myArray = {1, 2, 3};
        System.out.println("myArray[1] = " + myArray[1]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int i : myArray) {
            System.out.println(i);
        }
        
        // 2. Two-dimensional array
        System.out.println("== 이차원 배열 ==");
        
        int[][] myArray2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("myArray2[1][2] = " + myArray2[1][2]);

        for (int i = 0; i < myArray2.length; i++) {             // 행의 개수 (2)
            for (int j = 0; j < myArray2[i].length; j++) {      // 열의 개수 (3)
                System.out.println(myArray2[i][j]);
            }
        }
        
        for (int[] ints : myArray2) {
            for (int arInt : ints) {
                System.out.println("arInt = " + arInt);
            }
        }

//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        System.out.println("== Q1 ==");
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

//        testArray1[0][0] = 10;
//        testArray1[0][1] = 1;
//        testArray1[0][2] = 10;
//
//        testArray1[1][0] = 1;
//        testArray1[1][1] = 10;
//        testArray1[1][2] = 1;
//
//        testArray1[2][0] = 10;
//        testArray1[2][1] = 0;
//        testArray1[2][2] = 10;

        for (int k = 0; k < testArray1.length; k++) {
            for (int g = 0; g < testArray1[k].length; g++) {
                testArray1[k][g] = 1;

                if (k == g) {
                    testArray1[k][g] = 10;
                }
            }
        }

        // 3 X 3 행렬 구성
        for (int[] itemRow : testArray1) {
            for (int itemCol : itemRow) {
                System.out.print(itemCol + " ");
            }
            System.out.println();
        }
    }
}
