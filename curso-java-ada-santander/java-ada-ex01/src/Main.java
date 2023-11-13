
public class Main {
    public static void main(String[] args) {
        /*String nome;
        nome = "Brasil";
        nome = "Clara";
        System.out.printf("Olá " + nome);

         */

        /*Foi aprendido sobre tipo boolean e valores lógicos. Sobre o and e or ou && e ||. Sobre os operadores
        ternários na operação de mensagem e condição se algo é verdadeiro mostra tal mensagem se for falso
        mostra outra mensagem com se sendo ? e se não sendo : e aparecendo outra mensagem
         */

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}