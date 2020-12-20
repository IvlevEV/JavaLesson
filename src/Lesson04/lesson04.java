package Lesson04;

import java.util.Random;
import java.util.Scanner;

public class lesson04 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }


            aiTurn();

           // aiBlockTurn ();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char sign) {
        int countV;
        int countH;
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i <= map.length -1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= map.length -1; j++) {
                //Проверка по горзонтали
                if (map[i][j] == sign) {
                    countH++;
                    if (countH == DOTS_TO_WIN) return true;
                }else countH = 0;

                //Проверка по вертикали
                if (map[j][i] == sign) {
                    countV++;
                    if (countV == DOTS_TO_WIN) return true;
                }else countV = 0;
            }

            // Главная диогональ
            if (map[i][i] == sign) {
                countDiagonalA++;
                if (countDiagonalA == DOTS_TO_WIN) return true;
            } else countDiagonalA = 0;

            // Побочная диогональ
            if (map[i][map.length - 1 - i] == sign) {
                countDiagonalB++;
                if (countDiagonalB == DOTS_TO_WIN) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

//  4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
//  Работает не адекватно, почему не понимаю. aiBlockTurn

    public static void aiBlockTurn () {

        int countV = 0;
        int countH = 0;
        int countDiagonalA1 = 0;
        int countDiagonalB1 = 0;

        for (int i = 0; i <= map.length - 1; i++) {
            for (int j = 0; j <= map.length - 1; j++) {
                //Проверка по горзонтали
                if (map[i][j] == DOT_X) {
                    countH++;
                    if (countH == (DOTS_TO_WIN - 1)) {
                        for (int k = 0; k < map.length; k++) {
                            if (map[i][k] == DOT_EMPTY) {
                                map[i][k] = DOT_O;
                                System.out.println("Компьютер походил в точку горизонт " + (i + 1) + " " + (k + 1));
                                countH = DOTS_TO_WIN;
                                return;
                            }
                        }
                    }
                } else countH = 0;

                //Проверка по вертикали
                if (map[j][i] == DOT_X) {
                    countV++;
                    if (countV == (DOTS_TO_WIN - 1)) {
                        for (int k = 0; k < map.length; k++) {
                            if (map[k][i] == DOT_EMPTY) {
                                map[k][i] = DOT_O;
                                System.out.println("Компьютер походил в точку вертика " + (k + 1) + " " + (i + 1));
                                countV = DOTS_TO_WIN;
                                return;
                            }
                        }
                    } else countV = 0;
                }


                // Побочная диогональ
                if (map[i][map.length - 1 - i] == DOT_X) {
                    countDiagonalB1++;
                    if (countDiagonalB1 == (DOTS_TO_WIN - 1)) {

                        for (int k = 0; k < map.length; k++) {
                            if (map[k][map.length - 1 - k] == DOT_EMPTY) {
                                map[k][map.length - 1 - k] = DOT_O;
                                System.out.println("Компьютер походил в точку  побоч4" + (k + 1) + " " + ((map.length - 1 - k) + 1));
                                countDiagonalB1 = DOTS_TO_WIN;
                                return;
                            }
                        }
                    } else countDiagonalB1 = 0;
                }

                // Главная диогональ
                if (map[i][i] == DOT_X) {
                    countDiagonalA1++;
                    if (countDiagonalA1 == (DOTS_TO_WIN - 1)) {
                        for (int k = 0; k < map.length; k++) {
                            if (map[k][k] == DOT_EMPTY) {
                                map[k][k] = DOT_O;
                                System.out.println("Компьютер походил в точку  главная диогоноаль тупень" + (k + 1) + " " + (k + 1));
                                countDiagonalA1 = DOTS_TO_WIN;
                                return;
                            }
                        }
                    }else countDiagonalA1 = 0;
                }
            }
        }
      aiTurn();
    }


    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        System.out.println("Random !!!!!");
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
