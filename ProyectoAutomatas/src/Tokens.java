/**
 * @author David Alejando Gonzalez Quezada
 * @project ProyectoAutomatas
 * 19/11/22
 */
public class Tokens {

    Boolean arithmeticOperator(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '+' || word.charAt(i) == '*' || word.charAt(i) == '%'
                    || word.charAt(i) == '-' || word.charAt(i) == '/') {
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

    Boolean logicOperator(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.equals("&&") || word.equals("||") || word.equals("!")) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    Boolean assignmentOperator(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '=') {
                if (word.length() > 2){
                    System.out.println("la palabra empieza con un operdor de asignacion pero tiene un caracter despues");
                    return false;
                } else {
                    System.out.println("Es un operador de asignacion");
                    isValid = true;
                }
            }
        }
        return isValid;
    }

}
