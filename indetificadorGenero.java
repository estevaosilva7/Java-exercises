import java.util.Scanner;

public class IdentificadorGenero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o gênero (M ou F): ");
        String genero = input.next();

        if (genero.equalsIgnoreCase("M")) {
            System.out.println("Gênero: Masculino");
        } else if (genero.equalsIgnoreCase("F")) {
            System.out.println("Gênero: Feminino");
        } else {
            System.out.println("Gênero inválido");
        }
    }
}
