/**
 * @author David Alejando Gonzalez Quezada
 * @project ProyectoAutomatas
 * 19/11/22
 */
public class Tokens {

    Boolean arithmeticOperator(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '+' || word.charAt(i) == '*' || word.charAt(i) == '%') {
                if (word.length() > 2){
                    System.out.println("la palabra empieza con un operdor pero tiene un caracter despues");
                    return false;
                } else {
                    System.out.println("Es un operador aritmetico");
                    isValid = true;
                }
            }
        }
        return isValid;
    }

}
