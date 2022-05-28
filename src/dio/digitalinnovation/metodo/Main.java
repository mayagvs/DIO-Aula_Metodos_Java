package dio.digitalinnovation.metodo;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCÍCIO CALCULADORA");
        Calculadora.soma(1, 3);
        Calculadora.subtracao(4, 8);
        Calculadora.multiplicacao(7, 7);
        Calculadora.divisao(8, 8);

        System.out.println("EXERCÍCIO MENSAGEM");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(19);

        System.out.println("EXERCÍCIO EMPRÉSTIMO");
        Emprestimo.CalcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.CalcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.CalcularEmprestimo(1000, 5);

        System.out.println("EXERCÍCIO QUADRILÁTERO");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
