import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //Criei um array com suas posições
//
//        int[] numeros = new int[5];
//        numeros[0] = 1;
//        numeros[1] = 1;
//        numeros[2] = 1;
//        numeros[3] = 1;
//        numeros[4] = 1;
//
//        //Para acessar os valores do array usa uma estrutura laço de repetição
//
//        for (int i = 0; i < numeros.length; i++){
//            System.out.println(i);
//        }

//        String[] letras = new String[5];
//        letras[0] = "A";
//        letras[1] = "B";
//        letras[2] = "C";
//        letras[3] = "D";
//        letras[4] = "E";
//
//        for (int i = 0; i < letras.length; i++){
//            System.out.println(letras[i]);
//        }

        String[] letras = {"A", "B", "C", "D", "E"};

//        for (int i = 0; i < letras.length; i++){
//            System.out.println(letras[i]);
//        }

        //Não é necessário definir um laço para mostrar os objetos do array pode simplesmente

        System.out.println(Arrays.toString(letras));

        //O menor elemento do array e a média entre eles

        int[] numeros = { 9, 10, 12, 25, 2 };
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }

            media = media + numeros[i];
        }


        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média é: " + media/numeros.length);




    }

}