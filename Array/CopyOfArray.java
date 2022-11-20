import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] origin = new int[]{1, 2, 3, 4, 5};
        int newArrayLength = 10;

        // 1번째
        int[] firstCopyArray = new int[newArrayLength];
        System.arraycopy(origin, 0, firstCopyArray, 0, origin.length);

        // 2번째
        int[] secondCopyArray = Arrays.copyOf(origin, newArrayLength);

        // 3번째
        int[] thirdCopyArray = (int[]) origin.clone();

        // 4번째
        int [] fourthCopyArray = new int[newArrayLength];
        for (int i = 0; i < origin.length; i++) {
            fourthCopyArray[i] = origin[i];
            System.out.println(fourthCopyArray[i]);
        }
    }
}
