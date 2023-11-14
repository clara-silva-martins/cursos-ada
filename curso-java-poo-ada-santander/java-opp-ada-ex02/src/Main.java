import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        //Cachorro cachorro1= new Cachorro("Ellie", "Dourado", 100, 20, 30, "carinho");

        Gato gato1 = new Gato ("Mimi", "Branco", 7);
        Animal gato2 = new Gato("Felix", "preto", 4.5);
        // Esse não pode -> Gato gato3 = new Animal("oxy", "amarelo", 5);
        // Não pode, pois animal é uma classe abstrata e não pode criar objeto animal sem definir se é um passaro,
        // cachorro ou gato, pois ela é so um mapa.
        // Animal gato4 = new Animal("oxy","amarelo", 5)
        Animal passaro1 = new Passaro("piupiu", "azul", 0.5);



        //Passaro passarinho1 = new Passaro ("Pipiu", "Amarelo", 0.5);

//        gato2.soar();
//        gato1.soar();
//        passaro1.soar();

        //Polimorfismo capacidade de um objeto ser referenciado de varias formas. Muda a maneira como nos
        // referenciamos ele. Por exemplo se um gato é um animal então posso me referenciar a ele somente como animal
        // . A classe de referencia pode ser diferente da classe verdadeira dela.

//        Petshop petshop = new Petshop();
//
//        petshop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//
//        petshop.darBanho(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//
//        petshop.tosar(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());













        //Cachorro cachorro1 = new Cachorro();
        //System.out.println(cachorro1.getNumeroDeCachorros());

        //Cachorro cachorro2= new Cachorro("Luke", "Preto", 70, 5, 10, "carinho");
        //System.out.println(cachorro2.getNumeroDeCachorros());

        //Metodo toString serve mostrar a referencia de memória do objeto, mas se ele for sobescrito na classe pode
        // alterar a forma de visualizar ele, para não precisar decorar o endereço de memória. Por padrão definir o
        // toString
        // para uma variável que é única em um objeto, como o cpf

//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());

        //System.out.println(cachorro2.getNumeroDeCachorros());


        //Variável estática para contar a quantidade de objetos. Ela funciona como uma variável única para cada
        // classe e pertence a todos os objetos, engloba todos eles da classe.


//        cachorro1.setNome("puppy");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);


//        cachorro1.latir();
//        System.out.println("Pegou a " + cachorro1.pegar());
//        System.out.println("Seu nome é " + cachorro1.getNome());
//        System.out.println(cachorro1.interagir("vai dormir"));
//        System.out.println(cachorro1.interagir("carinho"));
//        System.out.println(cachorro1.interagir("nada"));

    }
}