package Lesson02;

import java.util.Random;


public class lessone02 {
    public static void main(String[] args) {
        // doVariableArgumentDemo();
        doHomework1();
        System.out.println();
        doHomework2();
        System.out.println();
        doHomework3();
        System.out.println();
        doHomework4();
        System.out.println();
        doHomewor5(doRandomIntArry());
        System.out.println();
        System.out.println("Сумма левой и правой части массива:" + doHomework6());
        System.out.println();
        doHomework7();
        System.out.println();
    }

    static int[] doRandomIntArry() {
        Random random = new Random();
        int[] randDigits = new int[9];

        for (int i = 0; i < randDigits.length; i++) {
            randDigits[i] = random.nextInt(9);
        }
        System.out.println("Случайниый массирв:");
        printArray(randDigits);
        return randDigits;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void doHomework1() {
        int[] matrix = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Оригенальая матрица:");
        printArray(matrix);
        System.out.println("Обратная матрица:");
        printArray(matrix, true);
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    static void doHomework2() {
        System.out.println("Массив размером 8 с помощью цикла:");
        int[] mathArray = new int[8];
        for (int i = 1; i < mathArray.length; i++) {
            mathArray[i] = mathArray[i - 1] + 3;
        }
        printArray(mathArray);
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void doHomework3() {
        int[] matrix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Оригенальая матрица:");
        printArray(matrix);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] < 6) {
                matrix[i] = matrix[i] * 2;
            }
        }
        System.out.println("Измененная матрица соогласно i<6=i*2:");
        printArray(matrix);
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    static void doHomework4() {
        int[][] matrix = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        System.out.println("Оригенал матрицы:");
        System.out.println();
        printArray(matrix);
        doWork4(matrix);
        System.out.println();
        System.out.println("Диагональные элементы матрицы единицами:");
        System.out.println();
        printArray(matrix);
    }

    static void doWork4(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i][i] = 1;
            numbers[i][numbers.length - 1 - i] = 1;
        }
    }

    /**
     * 5. ** Задать одномерный массив и найти в нем минимальный
     * и максимальный элементы (без помощи интернета);
     */
    static void doHomewor5(int[] values) {
        int max = findMax(values);
        System.out.println("Max: " + max);

        int min = findMin(values);
        System.out.println("Min: " + min);
    }

    /**
     * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
     * граница показана символами ||, эти символы в массив не входят.
     */

    static boolean doHomework6() {
        int[] matrix = {1, 1, 1, -1, 3, 1};
        System.out.println("Проверяемый массив:");
        printArray(matrix);
        int sum = 0;
        int rightSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i];
        }
        for (int i = 0; i < matrix.length; i++) {
            rightSum += matrix[i];
            if (rightSum == sum - rightSum) {
                System.out.println("Точка баланса это элемент № " + i);
                return true;
            }
        }
        return false;
    }

    /**
     * 7. **** Написать метод, которому на вход подается одномерный массив и число n
     * (может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементы массива на n позиций.
     * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
     * при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     */

    static void doHomework7() {
        int[] matrix = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Оригенальаый ммассив:");
        printArray(matrix);
        System.out.println("Массив со сдвигом:");
        printArray(33, matrix);
    }

    static int greateCommonDivisor(int a, int b) {
        if (b == 0)
            return a;
        else
            return greateCommonDivisor(b, a % b);
    }

    static void printArray(int n, int[] values) {

        if (n > values.length) {
            do
                n = n - values.length;

            while (n > values.length);
        }

        if (n + values.length < values.length) {
            do
                n = n + values.length;

            while (n + values.length < values.length);
        }

        int currentIndex, movedIndex, buffer;
        for (int i = 0; i < greateCommonDivisor(n, values.length); i++) {

            buffer = values[i];
            currentIndex = i;

            if (n > 0) {
                while (true) {
                    movedIndex = currentIndex + n;

                    if (movedIndex >= values.length) {
                        movedIndex = movedIndex - values.length;
                    }

                    if (movedIndex == i) {
                        break;
                    }
                    values[currentIndex] = values[movedIndex];
                    currentIndex = movedIndex;
                }
            } else if (n < 0) {
                while (true) {
                    movedIndex = currentIndex + n;

                    if (movedIndex < 0) {
                        movedIndex = values.length + movedIndex;
                    }
                    if (movedIndex == i) {
                        break;
                    }

                    values[currentIndex] = values[movedIndex];
                    currentIndex = movedIndex;
                }
            }

            values[currentIndex] = buffer;
        }

        printArray(values);

    }

    static int findMax(int[] digits) {
        int max = digits[0];
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] > max) {
                max = digits[i];
            }
        }
        return max;
    }

    static int findMin(int[] digits) {
        int min = digits[0];
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] < min) {
                min = digits[i];
            }
        }
        return min;
    }

    static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static void printArray(int[] values, boolean reverse) {
        if (!reverse) {
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]);
                System.out.print(" ");
            }
            System.out.println();
        } else {
            for (int i = values.length - 1; i >= 0; i--) {
                System.out.print(values[i]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void printArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void printArray(double[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
