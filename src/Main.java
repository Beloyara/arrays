import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача из видеоурокa
        int [ ] weights = new int[]{90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights [0] = 90;
        int jenuaryWeight = weights[0];
        System.out.println(jenuaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int jenuary = 0;
        System.out.println(weights[jenuary]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        // Задача 1 и 2

        int [ ] array1 = new int [3];
        array1 [0] = 1;
        int array1Value1 = array1[0];
        array1 [1] = 2;
        int array1Value2 = array1[1];
        array1 [2] = 3;
        int array1Value3 = array1[2];
        System.out.print(array1[0] + ", ");
        System.out.print(array1[1] + ", ");
        System.out.print(array1[2]);
        System.out.println();

        double [ ] array2 = {1.57, 7.654, 9.986};
        System.out.print(array2[0] + ", ");
        System.out.print(array2[1] + ", ");
        System.out.print(array2[2]);
        System.out.println();

        double [ ] price = {17.15, 19.36, 18.76};
        System.out.print(price[0] + ", ");
        System.out.print(price[1] + ", ");
        System.out.print(price[2]);
        System.out.println();

        // Задача 3

        System.out.print(array1[2] + ", ");
        System.out.print(array1[1] + ", ");
        System.out.print(array1[0]);
        System.out.println();

        System.out.print(array2[2] + ", ");
        System.out.print(array2[1] + ", ");
        System.out.print(array2[0]);
        System.out.println();

        System.out.print(price[2] + ", ");
        System.out.print(price[1] + ", ");
        System.out.print(price[0]);
        System.out.println();

        // Задача 4
        array1 [0] = array1 [0] + 1;
        array1 [2] = array1 [2] + 1;
        System.out.println(Arrays.toString(array1));

        {
            for (int i = array1[0]; i <= array1 [array1.length - 1]; i++) {
            }
        }
    }
}