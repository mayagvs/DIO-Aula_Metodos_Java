package dio.digitalinnovation.metodo;

public class Calculadora {

    public static void soma (double num1, double num2) {
        double result = num1 + num2;
        System.out.println("SOMA: " + result);
    }

    public static void subtracao (double num1, double num2) {
        double result = num1 - num2;
        System.out.println("SUBTRAÇÃO: " + result);
    }

    public static void multiplicacao (int num1, int num2) {
        double result = num1 * num2;
        System.out.println("MULTIPLICAÇÃO: " + result);
    }

    public static void divisao (double num1, double num2) {
        double result = num1/num2;
        System.out.println("DIVISÃO: " + result);
    }


}
