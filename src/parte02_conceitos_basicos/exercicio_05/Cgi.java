package parte02_conceitos_basicos.exercicio_05;

public class Cgi {
    private String mensagem;

    public Cgi(String mensagem){
        this.mensagem = mensagem;
    }

    public void exibirInformacoes(){
        System.out.println("Content-Type: text/html \n");

        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>" + mensagem + "</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
