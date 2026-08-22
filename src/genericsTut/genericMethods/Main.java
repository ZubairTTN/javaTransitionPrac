package genericsTut.genericMethods;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] strArr = {"Mohd", "Zubair", "Ahmed"};
        m.printArray(strArr);
        m.printArray(intArray);
    }

//    Syntax
    public <T> void printArray(T[] arr)
    {
        for (T value: arr)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
//   Method OverLoading
    public void printArray(Integer[] arr)
    {
        System.out.println("This is specified Integer method running...");
        for(Integer value: arr)
        {
            System.out.print(value + " ");
        }
    }
}
