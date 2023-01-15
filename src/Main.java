public class Main {
    public static void main(String args[]) {
        int currentBalance = 200;
        int plusSum = 999; //  сумма пополнения счёта

        int bonus = 0;
        if (plusSum > 1000) {
            bonus = plusSum / 100; // количество начисляемых бонусных рублей при пополнении на 1000+ руб.
        }
        int newBalance = currentBalance + plusSum + bonus; // итоговый счёт

        System.out.println("Сумма бонусных рублей - " + bonus);
        System.out.println("Итоговый счёт - " + newBalance + " рублей");
    }

}
