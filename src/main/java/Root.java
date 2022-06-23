public class Root {

    private static double root(int number) {
        if (number < 0) throw new IllegalArgumentException("Wprowadzona liczba jest mniejsza od 0");
        double root = Math.pow(number, 0.5);
        return root;
    }

}
