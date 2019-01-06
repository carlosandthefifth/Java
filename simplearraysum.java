public class simplearraysum {

    public static int sumArray(int[] numbers) {
        int i   = 0;
        int sum = 0;
        for (i =0; i < numbers.length ; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int result = simplearraysum.sumArray(nums);
        System.out.println("result: " + result);
    }
}