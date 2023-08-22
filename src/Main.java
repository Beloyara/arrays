import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача из видеоурокa
        int[] weights = new int[]{90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int jenuaryWeight = weights[0];
        System.out.println(jenuaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int jenuary = 0;
        System.out.println(weights[jenuary]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        System.out.println();


        // Задача 1 и 2
        System.out.println("Задача 2");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        int arr1Val1 = arr1[0];
        arr1[1] = 2;
        int arr1Val2 = arr1[1];
        arr1[2] = 3;
        int arr1Val3 = arr1[2];
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        for (double i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[(int) i]);
                break;
            }
            System.out.print(arr2[(int) i] + ", ");
        }
        System.out.println();

        double[] arr3 = {36.78, 675, 74.935};
        for (double i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[(int) i]);
                break;
            }
            System.out.print(arr3[(int) i] + ", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Задача 3");

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача 4");


        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] = arr1[i] + 1;
                if (i == arr1.length - 1) {
                    System.out.print(arr1[i]);
                    break;
                }
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();
    }
}