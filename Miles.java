public class Miles {
    public static String showMiles(int digito) {
        String digString = String.valueOf(digito);
        char[] digitss = digString.toCharArray();
        int size = digString.length();
        String cents = digString.substring(size - 3);
        char[] centsa = cents.toCharArray();
        String part1 = new String();
        String nombre = new String();

        if (size == 4) {
            if (digitss[0] == '1')
                part1 = "ett tusen ";
            else 
                part1 = Unidad.showUnidad(Character.getNumericValue(digitss[0])) + " tusen ";
        }
        else if (size == 5) {
            part1 = Decena.showDecena(Integer.parseInt(digString.substring(0, 2))) + " tusen ";
        }
        else if (size == 6) {
            part1 = Centena.showCentena(Integer.parseInt(digString.substring(0, 3))) + " tusen ";

        }
        if (centsa[0] == '0' && centsa[1] == '0' && centsa[2] == '0')
            nombre = part1;
        else if (centsa[0] == '0' && centsa[1] == '0')
            nombre = part1 + "og " + Unidad.showUnidad(Character.getNumericValue(centsa[2]));
        else if (centsa[0] == '0' && centsa[1] != '0')
            nombre = part1 + "og " + Decena.showDecena(Integer.parseInt(cents.substring(1)));
        else {
        //else if (centsa[0] != '0' && centsa[1] != '0' && centsa[2] != '0')
            nombre = part1 + Centena.showCentena(Integer.parseInt(cents));
        }
        return nombre;
    }
}