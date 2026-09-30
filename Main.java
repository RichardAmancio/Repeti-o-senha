import java.util.Scanner;

public class Main {

    public static String avaliarSenha(String senha) {

        // Regra 1: Tamanho mínimo
        if (senha.length() < 8) {
            return "DICA: A senha deve ter no mínimo 8 caracteres.";
        }

        // Regra 2: Deve conter números
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                temNumero = true;
                break;
            }
        }

        if (!temNumero) {
            return "DICA: Adicione pelo menos um número à sua senha.";
        }

        return "Em análise...";
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = entrada.nextLine();

        String resultado = avaliarSenha(senha);

        System.out.println(resultado);

        entrada.close();
    }
}