public class Main {
    public static void main(String[] args) {

        // входные данные
        int account = 500; // сумма
        int deposit = 1001; // пополнение

        // решение
        int percent = (deposit > 1000) ? 1 : 0;
        int bonus = deposit / 100 * percent;
        int balance = account + deposit + bonus;
        System.out.println("Ваш баланс равен: " + balance + " Ваш бонус равен: " + bonus);
    }
}
