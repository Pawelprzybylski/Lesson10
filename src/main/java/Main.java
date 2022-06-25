public class Main {

    public void validate(int[] values) {
        for (int i = 0; i < values.length; i++) {

            try {
                if (values[i] % 3 == 0) {
                    System.out.println("Liczba jest podzielna przez 3");
                } else {
                    throw new IllegalArgumentException("Liczba jest niepodzielna przez 3");
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }

        }
    }

}

