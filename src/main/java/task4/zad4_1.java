package task4;

// 1. Создаем перечисление для времен года
enum Season {
    Spring("Весна", "теплое время года", 15),
    summer("Лето", "жаркое время года", 25),
    autumn("Осень", "прохладное время года", 10),
    winter("Зима", "холодное время года", 0);

    private String name;
    private String description;
    private int averageTemperature;

    Season(String name, String description, int averageTemperature) {
        this.name = name;
        this.description = description;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }
}

public class zad4_1 {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.summer;

        System.out.println("Мое любимое время года: " + myFavoriteSeason.getName());
        System.out.println("Описание: " + myFavoriteSeason.getDescription());
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + " градусов Цельсия");

        // 6) Распечатываем все времена года и их информацию
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season.getName());
            System.out.println("Описание: " + season.getDescription());
            System.out.println("Средняя температура: " + season.getAverageTemperature() + " градусов Цельсия");
            System.out.println();
        }
    }
}
