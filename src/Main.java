public class Main {
    public static void main(String[] args) {
        int ticket = 15646; // Стоимость билета
        int pieces = 50; // Кол-во рублей для одной мили

        int bonus = ticket / pieces;

        System.out.println("Бонусные мили: " + bonus);
    }
}
