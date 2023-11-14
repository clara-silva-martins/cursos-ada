package Animais;

public class Cachorro extends Animal {

    static int numeroDeCachorros;

    private int tamanhoDoRabo;


    //Aqui foi usado construtor e passado os valores no main através do construtor
    //public Cachorro(){}

    public Cachorro (String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }



    public String pegar(){
        return "bolinha";
    }

//    public String interagir(String acao){
//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        } else if (acao.equals("vai dormir")){
//            this.estadoDeEspirito = "bravo";
//        } else{
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;
//    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    //Usando o metodo toString que serve para

    @java.lang.Override
    public java.lang.String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                "altura='" + altura+ '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU");
    }

    public String interagir(String acao){
        switch (acao){
            case "carinho":
                this.estadoDeEspirito = "Cachorra feliz";
                break;
            case "nada":
                this.estadoDeEspirito = "Cachorra neutra";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "Cachorra brava";
                break;
            default:
                this.estadoDeEspirito = "Você precisa interagir com o doguinho!";
        }

        return this.estadoDeEspirito;


    }




}
