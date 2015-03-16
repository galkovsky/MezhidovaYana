import static java.lang.Math.*;

/**
 * Created by Яна on 06.03.2015.
 */
public class GeometricProgression {

    int[] array;
    //\\ А зачем же нам N ? ) Если в N лежит длина массива, то ее всегда можно взять через array.length
    int N;
    //\\ И count не нужен. Можно смело удалять
    int count;

    public GeometricProgression(int[] array, int N) {
        this.array = array;
        this.N = N;
    }

    //\\ А как же логические имена для методов ? :)
    public void test1() {
        double test1 = array[1] / array[0];
        boolean flag = true;
        //\\ Вот тут ты верно отняла -1 от array.length
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j + 1] / array[j] != test1)
                flag = false;
            //\\ Здесь у тебя такая проблема, что ты проверяешь флаг тут же, после первой проверки частного двух элементов
            //\\ И в конце if ты делаешь break, выход из цикла.
            //\\ Из-за этого у тебя метод тут же завершает работу, после первой же проверки частного.
            //\\ Просто вынести проверку флага "за" цикл, и все исправится.
            //\\ Еще подумай о том, что флаг в false нужно ставить лишь 1 раз.
            //\\ Ведь если он стал false - то последовательность уже не геометрическая, и это значит, что пора завершать проверку
            if (!flag) {
                System.out.println("Последовательность введенных данных не является геометрической прогрессией!");
            } else
                System.out.println("Это Геометрическая прогрессия ");
            break;
        }
    }
}
