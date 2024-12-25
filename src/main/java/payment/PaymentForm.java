package payment;
import java.util.Scanner;
public class PaymentForm {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод данных платежа
            System.out.println("=== Платёжная форма ===");
            System.out.print("Введите сумму: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера после ввода числа

            System.out.print("Выберите способ оплаты (Credit Card, PayPal, Bank Transfer): ");
            String paymentMethod = scanner.nextLine();

            // Обработка платежа
            if (amount <= 0) {
                System.out.println("Ошибка: Сумма должна быть больше нуля.");
            } else if (!paymentMethod.equalsIgnoreCase("Credit Card") &&
                    !paymentMethod.equalsIgnoreCase("PayPal") &&
                    !paymentMethod.equalsIgnoreCase("Bank Transfer")) {
                System.out.println("Ошибка: Неподдерживаемый способ оплаты.");
            } else {
                System.out.println("Платёж успешно обработан!");
                System.out.println("Сумма: " + amount);
                System.out.println("Способ оплаты: " + paymentMethod);
            }

            scanner.close();
        }
    }

}
