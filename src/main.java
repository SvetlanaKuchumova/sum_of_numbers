import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Введи свое имя");
        //String s1 = scan.nextLine();
        //System.out.println("Привет, " + s1 + "! Эта программа считает сумму двух целых чисел");
        System.out.print("Введи первое число: ");
        int number1 = scan.nextInt();
        System.out.print("Введи второе число: ");
        int number2 = scan.nextInt();
        int sum = number1+number2;
        System.out.println ("Сумма чисел равна " + sum);
    }
}
