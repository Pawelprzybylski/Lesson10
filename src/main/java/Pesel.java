public class Pesel {

    public static void validatePesel(String pesel) {
        if (pesel.length() != 11) {
            throw new IllegalLengthException();
        } else if (pesel.matches(".*\\d.*")) {
            throw new WrongTypeOfDataException();
        }
    }

}









