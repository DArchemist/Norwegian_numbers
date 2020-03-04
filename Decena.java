public class Decena {
    public static String showDecena(int digito) {
        
        String digString = String.valueOf(digito);
        char[] digits = digString.toCharArray();
        String nombre = new String();
        String part1 = new String();

        if (digits[0] == '1') {
            switch (digito) {
                case 10: nombre = "ti"; break;
                case 11: nombre = "elleve"; break;
                case 12: nombre = "tolv"; break;
                case 13: nombre = "tretten"; break;
                case 14: nombre = "fjorten"; break;
                case 15: nombre = "femten"; break;
                case 16: nombre = "seksten"; break;
                case 17: nombre = "sytten"; break;
                case 18: nombre = "atten"; break;
                case 19: nombre = "nitten"; break;
            }
        }
        else {
            switch (digits[0]) {
                case '2': part1 = "tjue"; break;
                case '3': part1 = "tretti"; break;
                case '4': part1 = "førti"; break;
                case '5': part1 = "femti"; break;
                case '6': part1 = "seksti"; break;
                case '7': part1 = "sytti"; break;
                case '8': part1 = "åtti"; break;
                case '9': part1 = "nitti"; break;
            }
            if (digits[1] == '0') 
                nombre = part1;
            else 
                nombre = part1 + Unidad.showUnidad(Character.getNumericValue(digits[1]));
        }

        return nombre;
    } 
}