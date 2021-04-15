package lesson2;

public class HomeWorkApp {

    public static void main(String[] args) {

        Summ(100, 90);
        PosNegNumber(-7);
        NegPosNumber(0);
        StrNum("Hello", 5);
        Year(1700);

    }
    public static boolean Summ(int a, int b) {
        if (a+b>10 && a+b<20) {
            return true;
        } else {
            return false;
        }
    }

    public static void PosNegNumber(int a) {
        if (a>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean NegPosNumber(int a) {
        if (a<0) {
            return true;
        } else {
            return false;
        }
    }

    public static void StrNum(String b, int a) {
        for (int i=0; i<=a;i++) {
            System.out.println(b);
        }
    }

    public static boolean Year(int a) {
        if ((a%4==0 && a%100!=0) || (a%100==0 && a%400==0)) {
            return true;
        } else {
            return false;
        }
    }

}
