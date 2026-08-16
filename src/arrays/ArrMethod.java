package arrays;

public class ArrMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ArrMethod.arrSum(arr));
        int[] arr1 = {2, 3, 7, 45, 67, 43, 51, 25};
        System.out.println(ArrMethod.arrSum(arr1));
        String name = "                     Mohd Zubair Ahmed                ";
        System.out.println(ArrMethod.trimStr(name));
        System.out.println(name);
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

    public static String trimStr(String name)
    {
        return name.toUpperCase().trim();
    }

}


