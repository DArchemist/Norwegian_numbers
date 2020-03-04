public class Centena {
    public static String showCentena(int digito) {
        String digString = String.valueOf(digito);
        char[] digitss = digString.toCharArray();
        String lasttwo = digString.substring(1);
        char[] digits1 = lasttwo.toCharArray();
        String nombre = new String();
        String part1 = new String();
        String cerocero = new String("00");


        if (digitss[0] == '1') {
            part1 = "ett hundre";
            if (lasttwo.equals(cerocero)) 
                nombre = part1;
            else if (digitss[1] == '0' && digitss[2] != '0') 
                nombre = part1 + " og " + Unidad.showUnidad(Character.getNumericValue(digitss[2]));
            else if (digitss[1] != '0')
                nombre = part1 + " og " + Decena.showDecena(Integer.parseInt(lasttwo));
        }
        else {
            part1 = Unidad.showUnidad(Character.getNumericValue(digitss[0])) + " " + "hundre";
            if (lasttwo.equals(cerocero)) 
                nombre = part1;
            else if (digitss[1] == '0' && digitss[2] != '0')  
                nombre = part1 + " og " + Unidad.showUnidad(Character.getNumericValue(digitss[2]));
            else if (digitss[1] != '0')
                nombre = part1 + " og " + Decena.showDecena(Integer.parseInt(lasttwo));
        }

        return nombre;
    }
}