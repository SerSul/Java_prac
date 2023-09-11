package task2.ex_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Computer> computers;
    private Scanner scanner;

    public Shop() {
        computers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputerByBrand(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public void displayComputers() {
        if (computers.isEmpty()) {
            System.out.println("В магазине нет компьютеров.");
        } else {
            System.out.println("Компьютеры в магазине:");
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер по бренду");
            System.out.println("4. Вывести список компьютеров");
            System.out.println("5. Выход");

            int choice;
            try {
                choice = Integer.parseInt(shop.scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный выбор. Попробуйте снова.");
                continue;
            }

            switch (choice) {
                case 1:
                    String brand = shop.getStringInput("Введите бренд компьютера: ");
                    String model = shop.getStringInput("Введите модель компьютера: ");
                    double price = shop.getDoubleInput("Введите цену компьютера: ");
                    Computer computer = new Computer(brand, model, price);
                    shop.addComputer(computer);
                    System.out.println("Компьютер успешно добавлен.");
                    break;
                case 2:
                    shop.displayComputers();
                    int index;
                    try {
                        index = Integer.parseInt(shop.scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Некорректный индекс. Попробуйте снова.");
                        continue;
                    }
                    if (index >= 0 && index < shop.computers.size()) {
                        Computer removedComputer = shop.computers.get(index);
                        shop.removeComputer(removedComputer);
                        System.out.println("Компьютер успешно удален.");
                    } else {
                        System.out.println("Некорректный индекс.");
                    }
                    break;
                case 3:
                    String searchBrand = shop.getStringInput("Введите бренд компьютера для поиска: ");
                    Computer foundComputer = shop.findComputerByBrand(searchBrand);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер: " + foundComputer);
                    } else {
                        System.out.println("Компьютер с брендом '" + searchBrand + "' не найден.");
                    }
                    break;
                case 4:
                    shop.displayComputers();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        }
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Введите корректное число: ");
            }
        }
    }
}
