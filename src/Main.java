import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int razmer = scanner.nextInt();

        System.out.println("Введите значения массива");
        double[] array = new double[razmer];
        for (int i=0; i < razmer; i++) {
            array[i] = scanner.nextDouble();
        }

        double sum = 0;

        for (double i: array) {
            sum+=i;
        }

        double avg = sum/razmer;
        //System.out.println("Среднее арифметическое чисел: " + avg);

        for (int i=0; i<razmer; i++) {
            array[i]*=avg;
        }

        System.out.println("Элементы массива: " + Arrays.toString(array));
    }
}