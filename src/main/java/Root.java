public class Root {

    private static void root(int number) {
        Double root = Math.pow(number, 0.5);
        if (number < 0) throw new ArithmeticException("Wprowadzona liczba jest mniejsza od 0");
        System.out.println(root);
    }

}
