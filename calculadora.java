import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        double resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = input.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
