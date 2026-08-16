package oops.polymorphism;
public class MethodOverloadingImpl {
    public static void main(String[] args) {
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(3, 9));
        System.out.println(sum(45.67f, 98.21f));
        System.out.println("check if 13 is prime: " + isPrime(13));
        System.out.println("check if 15 is prime: " + isPrime(15));


    }

    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static float sum(float a, float b)
    {
        return a + b;
    }

    public static int sum(int ...a) // this is an alternative to changing method types as per required no of data to be added as it will handle both 2 paramters or 3 or anything that is passed in method call. as here a is being treated as an array.
    {
        int sum = 0;
        for(int i: a)
        {
            sum+= i;
        }
        return sum;
    }

//    Method to check if passed no is prime or not
    public static boolean isPrime(int a)
    {
        if(a == 0)
        {
            return false;
        }
        else{
            for(int i=2; i<= (a/2); i++)
            {
                if((a%i) == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

