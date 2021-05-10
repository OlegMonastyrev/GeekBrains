package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE=3;
    private static final char DOT_EMPTY='•';
    private static final char DOT_X='X';
    private static final char DOT_O='O';
    private static final char DOT_WIN='X';

    private static final char[][] map=new char[SIZE][SIZE];


    public static void main(String args[]) {
        initMap();
        printMap();
        isWin(DOT_WIN);

        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            computerTurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена!");
    }

    private static boolean isMapFull() {
        for (int i=0;i<SIZE;i++) {
            for (int j=0;j<SIZE;j++) {
                if (map[i][j]==DOT_EMPTY) return false;
                }
            }
        return true;
    }

    private static boolean isWin(char symbol) {
        if (rowColumnCheck(symbol)) {
            return true;
        } else {
            return diagCheck(symbol);
        }
    }

    private static boolean rowColumnCheck(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int row = 0;
            int column = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    row++;
                } else {
                    row = 0;
                }
                if (map[j][i] == symbol) {
                    column++;
                } else {
                    column = 0;
                }
                if (row == SIZE || column == SIZE) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean diagCheck(char symbol) {
        int diag=0;
        for (int i=0;i<SIZE;i++) {
            if (map[i][i]==symbol) {
                diag++;
            } else if (map[i][map.length-1]==symbol || map[map.length-1][i]==symbol) {
                diag++;
            } else {
                diag=0;
            }
            if (diag==SIZE) {
                return true;
            }
        }
        return false;
    }

    private static void printMap() {
        printHeader();
        printBody();
        System.out.println();
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random=new Random();

        do {
            x=random.nextInt(SIZE);
            y=random.nextInt(SIZE);
        } while (map[x][y]!=DOT_EMPTY);

        map[x][y]=DOT_O;
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Введите координаты X Y");
            x=readInt(scanner)-1;
            y=readInt(scanner)-1;

            if (x==-1 || y==-1) {
                System.out.println("Координаты должны быть числом!");
                scanner.nextLine();
            } else if (x<0 || x>=SIZE || y<0 || y>=SIZE) {
                System.out.println("Координаты введены неверно!");
            } else if (map[x][y]!=DOT_EMPTY) {
                System.out.println("Клетка уже занята!");
            } else {
                break;
            }
        } while (true);
        map[x][y]=DOT_X;
    }

    private static int readInt(Scanner scanner) {
        return scanner.hasNextInt() ? scanner.nextInt() : -1;
    }

    private static void printBody() {
        for (int i=0;i<SIZE;i++) {
            System.out.print((i+1)+" ");
            for (int j=0;j<SIZE;j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void initMap() {
        for (int i=0;i<SIZE;i++) {
            for (int j=0;j<SIZE;j++) {
                map[i][j]=DOT_EMPTY;
            }
        }
    }

    private static void printHeader() {
        for (int i=0;i<=SIZE;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
