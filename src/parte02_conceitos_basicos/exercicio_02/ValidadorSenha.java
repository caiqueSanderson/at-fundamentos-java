package parte02_conceitos_basicos.exercicio_02;

public class ValidadorSenha {
    public static String validar(String senha){
        if(senha.length() < 8){
            return "A senha deve ter pelo menos 8 caracteres.";
        }
        if (!senha.matches(".*[A-Z].*")){
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!senha.matches(".*\\d.*")){
            return "A senha deve conter pelo menos um número.";
        }
        if (!senha.matches(".*[@#$%¨&+=!].*")){
            return "A senha deve conter pelo menos um caracter especial.";
        }
        return "Senha válida";
    }
}
