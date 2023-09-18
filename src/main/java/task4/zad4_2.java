package task4;


enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);

    private int euroSize;


    private Size(int euroSize) {
        this.euroSize = euroSize;
    }


    public String getDescription() {
        if (this == XXS) {
            return "Детский ";
        }
        return "Взрослый ";
    }


    public int getEuroSize() {
        return euroSize;
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}


abstract class Clothes {
    private Size size;
    private double cost;
    private String color;


    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }


    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}


class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: размер " + getSize().getDescription() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: размер " + getSize().getDescription() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро");
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: размер " + getSize().getDescription() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: размер " + getSize().getDescription() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро");
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка: размер " + getSize().getDescription() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро");
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук: размер " + getSize().getDescription() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро");
    }
}

class Atelier {
    public static void dressWomen(WomenClothing[] clothes) {
        System.out.println("Женская одежда:");
        for (WomenClothing item : clothes) {
            item.dressWomen();
        }
    }

    public static void dressMan(MenClothing[] clothes) {
        System.out.println("Мужская одежда:");
        for (MenClothing item : clothes) {
            item.dressMan();
        }
    }
}

public class zad4_2 {
    public static void main(String[] args) {
        MenClothing[] menClothingArray = {
                new TShirt(Size.XS, 25.99, "Красный"),
                new Pants(Size.M, 49.99, "Синий"),
                new Tie(Size.L, 14.99, "Голубой")
        };

        WomenClothing[] womenClothingArray = {
                new TShirt(Size.XS, 25.99, "Красный"),
                new Pants(Size.S, 34.99, "Черный"),
                new Skirt(Size.S, 34.99, "Черный")
        };

        Atelier.dressWomen(womenClothingArray);
        Atelier.dressMan(menClothingArray);
    }
}
