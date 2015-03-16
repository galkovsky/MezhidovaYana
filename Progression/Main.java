
import java.io.IOException;
import java.util.Scanner;

/**
* Created by Яна on 05.03.2015.
*/
public class Main {

    public static void main(String[] args) throws IOException {
        int N = 3;
        int [] array = new int[N];

        ArithmeticProgression ArProg = new ArithmeticProgression(3,array);
        GeometricProgression GeoPr = new GeometricProgression(array,3);

        Scanner sc = new Scanner (System.in);
        for (int i=0; i<N; i++)
        {
            System.out.print("Введите число: ");
            array[i] = sc.nextInt();
            System.out.println (array[i]);
        }

        ArProg.test();
        GeoPr.test1();
    }
}


