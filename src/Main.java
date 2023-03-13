public class Main {
    public static void main(String[] args) {
        // цель: расчитать количество месяцев, чтобы накопить на телескоп

        // дано:

        // поля
        double teleskop = 14_000;
        double account = 1_000;
        double stependia = 2_500;


        // процент банка
        // double procentBank = 5.0;
         double procentMonth = 0.05 / 0.12;


        // найти: кол-во месяцев
        // будем считать
        int countMonth = 0;


        // цикл
        while (account < teleskop) {
            account = account + procentMonth *account / 100;
            countMonth++;
            account += stependia;
            System.out.println(countMonth + " " + account);
        }

        System.out.println(countMonth + " " + "месяцев" + " " + "надо для покупки телескопа" );

    }
}