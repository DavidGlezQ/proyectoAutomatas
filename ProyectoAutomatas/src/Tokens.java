/**
 * @author David Alejando Gonzalez Quezada
 * @project ProyectoAutomatas
 * 19/11/22
 */
public class Tokens {

    /*Lista de tokens:
    * idetificador: terminado
    * operador relacional: terminado
    * operador aritmetico: terminado
    * operador logico: terminado
    * asignacion: terminado
    * numero entero
    * numero decimal
    * comentario
    * parentesis: termiando
    * llave: terminado*/

    Boolean wholeNumber(String word) {
        /*validar el signo negativo
        * validar que sea un numero
        * despues del signo negativo validar sacando el residuo para saber si es o no entero
        * */
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') { //Validar si el numero es negativo
                if (numberValidation(word.charAt(i))) {
                    if (Integer.parseInt(word) % 2 == 0) {
                        isValid = true;
                    }
                }
            } else if (numberValidation(word.charAt(i))) { //validar si en numero es positivo
                if (Integer.parseInt(word) % 2 == 0) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    Boolean numberValidation(char character) {
        try {
            Integer.parseInt(String.valueOf(character));
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }

        /*return character == '0' || character == '1' || character == '2' || character == '3'
                || character == '4' || character == '5' || character == '6'
                || character == '7' || character == '8' || character == '9';*/
    }

    Boolean decimalNumber(String word) {
        /*validar el signo negativo
         * validar que sea un numero
         * despues del signo negativo validar sacando el residuo para saber si es o no entero
         * */
        boolean isValid = false;

        return isValid;
    }

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

    Boolean parenthesis(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '(' || word.charAt(i) == ')') {
                if (word.length() > 2){
                    System.out.println("la palabra empieza con un operdor pero tiene un caracter despues");
                    return false;
                } else {
                    System.out.println("Es una parentesis");
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    Boolean brackets(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '{' || word.charAt(i) == '}') {
                if (word.length() > 2){
                    System.out.println("la palabra empieza con un operdor pero tiene un caracter despues");
                    return false;
                } else {
                    System.out.println("Es una llave");
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    Boolean relationalOperator(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.equals("<") || word.equals(">") || word.equals("<=") || word.equals(">=") || word.equals("==") || word.equals("!=")) {
                System.out.println("Es un operador relacional");
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    Boolean logicOperator(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.equals("&&") || word.equals("||") || word.equals("!")) {
                System.out.println("Es un operador logico");
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
