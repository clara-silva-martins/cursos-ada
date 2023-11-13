import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2= new Cachorro("Ellie", "Dourado", 100, 20, 30, "carinho");

//        cachorro1.setNome("puppy");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        cachorro1.latir();
        System.out.println("Pegou a " + cachorro1.pegar());
        System.out.println("Seu nome é " + cachorro1.getNome());
        System.out.println(cachorro1.interagir("vai dormir"));
        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.interagir("nada"));

    }
}