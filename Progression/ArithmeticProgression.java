/**
 * Created by Яна on 06.03.2015.
 */
public class ArithmeticProgression {
    int N;
    int []array;

    public ArithmeticProgression(int N, int[] array) {
        this.N = N;
        this.array = array;
    }


    public void test (){

        double test = array[1] - array[0];
        boolean flag = true;
        for (int i=0; i<array.length-1; i++) {
            if (array[i + 1] - array[i] != test)
                flag = false;
            if (!flag) {
                System.out.println("Последовательность введенных данных не является арифметической прогрессией!");
            } else
                System.out.println("Это Арифметическая прогрессия");
            break;
        }
    }
}
