package genericsTut.wildCards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<>();
        numbers.add(null);

    }

    public static double sum(List<? extends Number> numbers)
    {
        double sum =0;
        for(Number o : numbers)
        {
            sum+= o.doubleValue();
        }
        return sum;
    }
}
