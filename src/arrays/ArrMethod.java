package arrays;

public class ArrMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ArrMethod.arrSum(arr));

    }

    public static int arrSum(int[] arr)
    {
        int sum = 0;
        for(int i: arr)
        {
            sum += i;
        }

        return sum;
    }

}


