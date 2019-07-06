import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        System.out.println("Введите цифру:\n 1 - запуск окна с текстом, \n 2 - запуск окна с расчетом суммы \n Enter - выход ");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        gui_text app1 = new gui_text();
        calc app2 = new calc();

        while (!str.isEmpty()) {
            try {
                int number = Integer.parseInt(str);
                if (number == 1 || number == 2) {
                    if (number == 1) {
                        if (app2.isVisible()) {
                            app2.setVisible(false);
                            app2.dispose();
                        }
                        app1.setVisible(true);
                        System.out.println("Введите цифру:\n 1 - запуск окна с текстом, \n 2 - запуск окна с расчетом суммы \n Enter - выход ");
                    } else { // number == 2
                        if (app1.isVisible()) {
                            app1.setVisible(false);
                            app1.dispose();
                        }
                        app2.setVisible(true);
                        System.out.println("Введите цифру:\n 1 - запуск окна с текстом, \n 2 - запуск окна с расчетом суммы \n Enter - выход ");
                    }
                } else {
                    if (app1.isVisible()) {
                        app1.setVisible(false);
                        app1.dispose();
                    }
                    if (app2.isVisible()) {
                        app2.setVisible(false);
                        app2.dispose();
                    }
                    System.out.println("Введите цифру 1 или 2");
                }
            } catch (NumberFormatException exp) {
                if (app1.isVisible()) {
                    app1.setVisible(false);
                    app1.dispose();
                }
                if (app2.isVisible()) {
                    app2.setVisible(false);
                    app2.dispose();
                }
                System.out.println("Некорректный ввод. Введите цифру 1 или 2");
            }
            str = scan.nextLine();
        }
        System.out.println("Завершение работы");
        if (app1.isVisible()) {
            app1.setVisible(false);
            app1.dispose();
        }
        if (app2.isVisible()) {
            app2.setVisible(false);
            app2.dispose();
        }
    }
}