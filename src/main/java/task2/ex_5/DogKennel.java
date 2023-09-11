package task2.ex_5;

public class DogKennel {
    private Dog[] dogs;
    private int numberOfDogs;


    public DogKennel(int capacity) {
        dogs = new Dog[capacity];
        numberOfDogs = 0;
    }


    public void addDog(Dog dog) {
        if (numberOfDogs < dogs.length) {
            dogs[numberOfDogs] = dog;
            numberOfDogs++;
        } else {
            System.out.println("Питомник переполнен. Нельзя добавить больше собак.");
        }
    }

    public void displayDogs() {
        System.out.println("Список собак в питомнике:");
        for (int i = 0; i < numberOfDogs; i++) {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {

        DogKennel kennel = new DogKennel(3);

        Dog dog1 = new Dog("Барон", 2);
        Dog dog2 = new Dog("Макс", 4);
        Dog dog3 = new Dog("Рекс", 3);

        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        kennel.displayDogs();
    }
}
