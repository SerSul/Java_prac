package prac24.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }

    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Complex1: " + complex1.getReal() + " + " + complex1.getImage() + "i");

        Complex complex2 = factory.CreateComplex(1, 2);
        System.out.println("Complex2: " + complex2.getReal() + " + " + complex2.getImage() + "i");
    }
}
