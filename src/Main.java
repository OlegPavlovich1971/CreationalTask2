import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int listSize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int upperLimit = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(upperLimit));
        }
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int f = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);
        logger.log("Завершаем программу");
    }
}
