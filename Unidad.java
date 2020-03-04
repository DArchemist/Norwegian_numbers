public class Unidad {

    public static String showUnidad(int digito) {
        
        String nombre = new String();

        switch (digito) {
            case 0: nombre = "null"; break;
            case 1: nombre = "én"; break;
            case 2: nombre = "to"; break;
            case 3: nombre = "tre"; break;
            case 4: nombre = "fire"; break;
            case 5: nombre = "fem"; break;
            case 6: nombre = "seks"; break;
            case 7: nombre = "sju"; break;
            case 8: nombre = "åtte"; break;
            case 9: nombre = "ni"; 
        }


        
        return nombre;
        
    }
}