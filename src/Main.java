public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // Начальная сумма на счету клиента
        int topUpAmount = 5800; // Сумма пополнения счета

        int bonusPer100Rubles = 1; // Бонус за каждые полные 100 рублей пополнения

        int bonus = (topUpAmount / 100) * bonusPer100Rubles; // Рассчитываем количество бонусных рублей
        int totalBalance = currentBalance + topUpAmount + bonus; // Рассчитываем итоговый счет клиента

        System.out.println("Итоговая сумма на счету клиента: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}

