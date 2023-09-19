package task4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum ProductCategory {
    ELECTRONICS,
    CLOTHING,
    BOOKS,
    TOYS
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

class Product {
    private String name;
    private double price;
    private ProductCategory category;

    public Product(String name, double price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void clearCart() {
        items.clear();
    }

    public List<Product> getItems() {
        return items;
    }
}

class OnlineStore {
    private List<Product> catalog;
    private List<User> users;
    private ShoppingCart shoppingCart;

    public OnlineStore() {
        catalog = new ArrayList<>();
        users = new ArrayList<>();
        shoppingCart = new ShoppingCart();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.authenticate(username, password)) {
                return user;
            }
        }
        return null; // нет такого пользователя
    }

    public void addToCatalog(Product product) {
        catalog.add(product);
    }

    public List<Product> getCatalog() {
        return catalog;
    }

    public void viewCatalog() {
        System.out.println("Catalog:");
        for (int i = 0; i < catalog.size(); i++) {
            Product product = catalog.get(i);
            System.out.println(i + 1 + ". " + product.getName() + " - $" + product.getPrice() + " - Category: " + product.getCategory());
        }
    }

    public void addToCart(Product product) {
        shoppingCart.addProduct(product);
    }

    public void viewCart() {
        List<Product> items = shoppingCart.getItems();
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("Корзина:");
            for (int i = 0; i < items.size(); i++) {
                Product product = items.get(i);
                System.out.println(i + 1 + ". " + product.getName() + " - $" + product.getPrice() + " - Категория: " + product.getCategory());
            }
        }
    }

    public double checkout() {
        List<Product> items = shoppingCart.getItems();
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        shoppingCart.clearCart();
        return total;
    }
}

public class zad4_3 {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        // Добавляем пользователей
        User user1 = new User("u1", "p1");
        store.addUser(user1);

        // Добавляем товары в каталог
        store.addToCatalog(new Product("Ноутбук", 999.99, ProductCategory.ELECTRONICS));
        store.addToCatalog(new Product("Футболка", 19.99, ProductCategory.CLOTHING));
        store.addToCatalog(new Product("Книга", 9.99, ProductCategory.BOOKS));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя пользователя: ");
        String username = scanner.nextLine();
        System.out.print("Введите ваш пароль: ");
        String password = scanner.nextLine();

        User currentUser = store.authenticateUser(username, password);

        if (currentUser != null) {
            System.out.println("Аутентификация успешна. Добро пожаловать, " + username + "!");
            boolean shopping = true;
            while (shopping) {
                System.out.println("\nВарианты:");
                System.out.println("1. Просмотреть каталог");
                System.out.println("2. Добавить в корзину");
                System.out.println("3. Просмотреть корзину");
                System.out.println("4. Оформить заказ");
                System.out.println("5. Выйти");
                System.out.print("Введите ваш выбор: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        store.viewCatalog();
                        break;
                    case 2:
                        System.out.print("Введите номер товара для добавления в корзину: ");
                        int productNumber = scanner.nextInt();
                        if (productNumber >= 1 && productNumber <= store.getCatalog().size()) {
                            Product selectedProduct = store.getCatalog().get(productNumber - 1);
                            store.addToCart(selectedProduct);
                            System.out.println(selectedProduct.getName() + " добавлен в корзину.");
                        } else {
                            System.out.println("Неверный номер товара.");
                        }
                        break;
                    case 3:
                        store.viewCart();
                        break;
                    case 4:
                        double total = store.checkout();
                        System.out.println("Итог $" + total);
                        break;
                    case 5:
                        shopping = false;
                        break;
                    default:
                        System.out.println("Неверный выбор. ");
                }
            }
        } else {
            System.out.println("Неверное имя пользователя или пароль.");
        }
    }
}
