import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String nome = "Clara";

        LocalDate hoje = LocalDate.now();
        //Com esse comando importado vai mostrar a data de hoje com dia, mes e ano

        Locale brasil = new Locale("pt", "BR");
        //Outro comando que precisa ser importado é o Locale

        String diaSemana = (hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        /*a data de hoje mas somente o dia da semana e como exibir a informação e o estilo que é sendo o nome
        completo e localidade, que precisa ser importado pelo new Locale onde é possível especificar linguagem e pais*/

        //É bom passar as informações para variáveis para facilitar na hora de refereniar essas variáveis e suas funções

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        //Com esse comando que foi importado ele mostra a hora de hoje e agora

        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 23){
            saudacao = "Boa noite";
        } else {
            saudacao = "ola";
        }

        //System.out.println(agora);

        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());


    }
}