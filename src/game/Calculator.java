package game;
import java.util.ArrayList;

public class Calculator
{
    //Indexes of the chosen integers in the array
    //Not the actual value
    Integer first;
    Integer second;
    String operator;
    ArrayList<Integer> arr;
    int ans;

    public Calculator(ArrayList<Integer> arr)
    {
        this.arr = arr;
        this.ans = ans;
    }

    private void replace()
    {
        if (!operator.equals("/") || (arr.get(first) % arr.get(second) == 0)) {
            int x = calculate(first, second, operator);
            arr.remove(first);
            arr.remove(second);
            arr.add(first, x);
        }
        first = null;
        second = null;
        operator = null;
    }
    private int calculate(int x, int y, String o)
    {
        switch(o)
        {
            case "*":
                return arr.get(x) * arr.get(y);
            case "+":
                return arr.get(x) + arr.get(y);
            case "/":
                if (arr.get(x) % arr.get(y) == 0)
                {
                    return arr.get(x) / arr.get(y);
                }
            case "-":
                return arr.get(x) - arr.get(y);
        }
        return x*y;
    }

    public void numSelection(int x)
    {
        if (first == null)
        {
            first = x;
        }
        else
        {
            second = x;
        }
    }

    public void opSelection(String x)
    {
        operator = x;
    }

}
