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
    * numeros enteros: terminado
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
                if (numberWholeValidation(String.valueOf(word.charAt(i)))) {
                    if (Integer.parseInt(word) % 2 == 0) {
                        isValid = true;
                    }
                }
            }
            if (numberWholeValidation(String.valueOf(word.charAt(i)))) { //validar si en numero es positivo
                if (Integer.parseInt(word) % 2 == 0) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    Boolean numberWholeValidation(String word) {
        try {
            return (Integer.parseInt(word) % 2 == 0);
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    Boolean numberDecimalValidation(String word) {
        /*validar el signo negativo
         * validar que sea un numero
         * despues del signo negativo validar sacando el residuo para saber si es o no entero
         * */
        try {
            return isDecimalNumber(word);
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    Boolean isDecimalNumber(String word) {
        Character c;
        boolean isValid = false;
        int control = 0;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            if (!Character.isDigit(c)) {
                if (c.equals('.') && control == 0) {
                    control ++;
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
        }
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
