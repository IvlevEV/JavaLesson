package Lesson03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lessone03 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        doHomework1gameNumber();
        doHomework2gameString();
    }

    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9
     * и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
     * чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос
     * – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    static void doHomework1gameNumber() {
        int inputAggeinGame;
        do {
            System.out.println("Ваша задача угадать число.");
            playLevel(10, 3);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет\n");
            inputAggeinGame = scanner.nextInt();
        }
        while (inputAggeinGame == 1);
    }

    static void playLevel(int range, int numberОfАttempts) {
        int randomNumber = (int) (Math.random() * range);
        while (numberОfАttempts > 0) {
            System.out.println("Угадайте число от 0 до " + range + ":");
            numberОfАttempts--;
            int input_number = scanner.nextInt();
            if (input_number == randomNumber) {
                System.out.println("Вы угадали !!!");
                break;
            } else if (input_number > randomNumber) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
            if (numberОfАttempts <= 0)
                System.out.printf("Число было %d. Вы НЕ угодали, удачи в следуйний раз !\n", randomNumber);
        }
    }

    /**
     * 2. * Создать массив из слов
     * При запуске программы компьютер загадывает слово, з
     * апрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
     * правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
     * которые стоят на своих местах.
     */

    static void doHomework2gameString() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Попробуйте угадать какое слово загадали:");
        gameString(words);
    }

    private static void gameString(String[] words) {
        String guess = null;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String word = words[rnd.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        do {
            System.out.print("Введите слово : ");
            guess = sc.next();
            for (int i = 0; i < 15; i++)
                if (i < word.length() && i < guess.length() && word.charAt(i) == guess.charAt(i)) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print((word.equals(guess)) ? "" : "#");
                }
            System.out.println();
        } while (!word.equals(guess));
        System.out.println("Браво !!! Вы угадали !!! Это и в праду было слово \" " + word + " \"");
    }


    static void printArray(String[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

}
