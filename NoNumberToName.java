public class NoNumberToName {
    public static String getName(int number) {
        String strNumber = String.valueOf(number);
        String output = new String();
        if (number < 0 || number > 999999999) {
            output = "Error! Solo se admiten números enteros positivos menores o iguales que 999 999 999";
        }
        else if (strNumber.length() == 1) {
            output = Unidad.showUnidad(number);
        }
        else if (strNumber.length() == 2) {
            output = Decena.showDecena(number);
        }
        else if (strNumber.length() == 3) {
            output = Centena.showCentena(number);
        }
        else if (strNumber.length() >= 4 && strNumber.length() < 7) {
            output = Miles.showMiles(number);
        }
        else {
            output = Millones.showMillones(number);
        }

        return output;
    }
}