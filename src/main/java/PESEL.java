import java.lang.invoke.WrongMethodTypeException;

public class PESEL {

    public static void PESEL() {
        try {
            String PESEL;
        } catch (WrongMethodTypeException e) {
            System.out.println("Niepoprawny format numeru PESEL");
        }
    }

    public static void PESEL(long PESEL) {
        if (PESEL != 11) {
            throw new IllegalArgumentException("Ilość podanych cyfr jest nieodpowiednia");
        } else System.out.println(PESEL);
    }

}









