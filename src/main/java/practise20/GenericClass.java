package practise20;

public class GenericClass<T, V, K> {
    private final T t;
    private final V v;
    private final K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "T=" + t.getClass().getName() + " : " + t +
                ", V=" + v.getClass().getName() + " : " + v +
                ", K=" + k.getClass().getName() + " : " + k +
                '}';
    }
}
