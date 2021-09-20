package game;
import java.util.*;

public class Generator
{
    private static int cards = 4;
    private static int num = 24;

    public static ArrayList<Integer> generate()
    {
        while (true)
        {
            int[] array = Generator.randomInts();
            if (Generator.judge(array))
            {
                Integer[] jeh = Arrays.stream(array).boxed().toArray( Integer[]::new );
                return new ArrayList<Integer>(Arrays.asList(jeh));
            }
        }
    }

    private static int[] randomInts()
    {
        int[] array = new int[cards];
        Random random = new Random();
        for (int i = 0; i < cards; i++)
        {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private static boolean judge(int[] array)
    {
        if (array.length == 1)
        {
            return array[0] == num;
        }

        int n = array.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int k = i + 1; k < n; k++)
            {
                int[] next = new int[n - 1];
                for (int j = 0, index = 0; j < n; j++)
                {
                    if (j != i && j != k)
                    {
                        next[index++] = array[j];
                    }
                }
                int num1 = array[i], num2 = array[k];

            }

        }
    }
}
