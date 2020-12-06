package Lesson01;

public class lessone01 {

    public static void main(String[] args) {

        Demo();
        System.out.println("Выражение a*(b+(c/d)= " + math(5.5f, 72.45f, 883.44f, 455.5f));
        System.out.println("Число лежит в итервале от 10 до 20 :" + inteval(1, 1));
        System.out.println("Число лежит в итервале от 10 до 20 :" + inteval1(1, 1));
        System.out.println("Число " + plusMinus(-3));
        System.out.println("Число " + plusMinus1(-3));
        name("Вася");
        year(2020);

    }

//  Создать переменные всех пройденных типов данных и инициализировать их значения.

    static void Demo() {
        byte by = 127;
        short sh = 32767;
        int i = -2147483648;
        long lo = 9223372036854775807L;
        float fl = Float.MAX_VALUE;
        double db = Double.MAX_VALUE;
        char ch = '\u00B5';
        boolean bool = true;
        System.out.println("Пременные всех пройденных типов данных и инициализировать их значения:");
        System.out.println("Byte =" + by);
        System.out.println("Short =" + sh);
        System.out.println("Int =" + i);
        System.out.println("Long =" + lo);
        System.out.println("Float =" + fl);
        System.out.println("Double =" + db);
        System.out.println("Char =" + ch);
        System.out.println("Boolean =" + bool);

    }

//Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.

    static float math(float a, float b, float c, float d) {

        return a * (b + (c / d));

    }

//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    static boolean inteval1(int a, int b) {

        return (a + b) >= 10 && (a + b) <= 20;
    }

//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    static String inteval(int a, int b) {

        if ((a + b) >= 10 && (a + b) <= 20) {
            return "Истина";
        } else return "Лож";
    }

//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    static String plusMinus(int a) {

        if (a >= 0) {
            return "положительное";
        } else return "отрицательное";
    }

//Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean plusMinus1(int a) {
        return a < 0;
    }

//Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    static void name(String a) {
        System.out.println("Привет," + a + "!");
    }

//Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    static void year(int a) {
        int b = a % 4;
        int c = a % 100;
        int d = a % 400;
        if (b != 0 || c == 0 && d == 0) {
            System.out.println(a + " это не високосный год !");
        } else System.out.println(a + " это високосный год !");
    }


}


