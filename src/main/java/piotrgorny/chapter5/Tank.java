package piotrgorny.chapter5;

public class Tank {
    private boolean isEmpty;

    public void fill() {
        isEmpty = false;
    }

    public void empty() {
        isEmpty = true;
    }

    protected void finalize() {
        if (!isEmpty) {
            System.out.println("Empty the tank first!");
        }
    }
}
