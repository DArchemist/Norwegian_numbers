public class Millones {
    public static String showMillones(int digito) {
        String digString = String.valueOf(digito);
        char[] digitss = digString.toCharArray();
        int size = digString.length();
        String mils = digString.substring(size - 6);
        char[] milsa = mils.toCharArray();
        String part1 = new String();
        String nombre = new String();

        if (size == 7) {
            if (digitss[0] == '1')
                part1 = "en million ";
            else 
                part1 = Unidad.showUnidad(Character.getNumericValue(digitss[0])) + " millioner ";
        }
        else if (size == 8) {
            part1 = Decena.showDecena(Integer.parseInt(digString.substring(0, 2))) + " millioner ";
        }
        else if (size == 9) {
            part1 = Centena.showCentena(Integer.parseInt(digString.substring(0,3))) + " millioner ";
        }

        if (mils.equals("000000")) {
            nombre = part1;
        }
        else if (milsa[0] == '0' && milsa[1] == '0' && milsa[2] == '0' && milsa[3] == '0' && milsa[4] == '0') {
            nombre = part1 + "og " + Unidad.showUnidad(Character.getNumericValue(milsa[5]));
        }
        else if (milsa[0] == '0' && milsa[1] == '0' && milsa[2] == '0' && milsa[3] == '0') {
            nombre = part1 + "og " + Decena.showDecena(Integer.parseInt(mils.substring(4)));
        }
        else if (milsa[0] == '0' && milsa[1] == '0' && milsa[2] == '0') {
            nombre = part1 + Centena.showCentena(Integer.parseInt(mils.substring(3)));
        }
        else if (milsa[0] == '0' && milsa[1] == '0') {
            nombre = part1 + Miles.showMiles(Integer.parseInt(mils.substring(2)));
        }
        else if (milsa[0] == '0' ) {
            nombre = part1 + Miles.showMiles(Integer.parseInt(mils.substring(1)));
        }
        else {
            nombre = part1 + Miles.showMiles(Integer.parseInt(mils));
        }

        return nombre;

    }
}