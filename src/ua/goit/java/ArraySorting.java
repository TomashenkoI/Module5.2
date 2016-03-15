package ua.goit.java;

/**
 * Created by 7 on 15.03.2016.
 */
public class ArraySorting {
    public static void main(String[] args) {

        int[] array = {4, 1, -1, 11, -20, 17, -5};

        for (int b = array.length; b > 0; b--) {

            for (int a = 0; a < array.length-1; a++)
            {
                if (array[a] > array[a+1])
                {
                    int more = array[a];
                    array[a] = array[a+1];
                    array[a+1] = more;

                }
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }
}
