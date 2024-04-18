public class lab1 {
    public static void main(String[] args) {
        System.out.println("Завдання 1:");
        int n = 76; //Введіть число для перевірки чи воно входить в проміжок

        // Перевірка, чи потрапляє число у проміжок
        if (n > 50 & n < 100) {
            System.out.println("Число " + n + " міститься в проміжку (50;100)");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (50;100)");
        }
    }
}
