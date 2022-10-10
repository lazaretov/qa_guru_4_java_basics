package com.lazaretov;

public class HelloWorld {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 16;
        double d = 1.25;
        double e = 2.25;
        int cordinateX = -4;
        int cordinateY = 9;
        String text = "тест";

        //Математические операторы
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (b--));

        //Комбинации типов данных
        System.out.println(text + a);
        System.out.println(text + " a");
        System.out.println("text" + a);
        System.out.println(d + e + a);

        //Условные конструкции
        if (cordinateX > 0 && cordinateY > 0) {
            System.out.println(1);
        } else if (cordinateX < 0 && cordinateY >0) {
            System.out.println(2);
        } else if (cordinateX < 0 && cordinateY < 0) {
            System.out.println(3);
        } else if (cordinateX > 0 && cordinateY < 0) {
            System.out.println(4);
        }

        //Логические операторы
        System.out.println(a > d && b <= e);
        System.out.println(1 > d || 12 >= 12);
        System.out.println((e * 5 == 40 / d) && (7 % a == 3 / b));

        //Переполнение при вычислениях
        byte b0 = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(b0 + " = Max_byte + 1");
        short s0 = (short) (Short.MIN_VALUE - 1);
        System.out.println(s0 + " = Min_short - 1");
    }

}
