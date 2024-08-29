package clasegenerica;

/*
 * @author DIEGO LOPEZ
 */
public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public String toString(T first, U second) {
        return "(" + first + "," + second + ")";
    }
}