package Animais;

public class Cachorro {
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public Cachorro(){}

    public Cachorro (String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }


    public void comer(){
        System.out.println("Comendo");
    }

    public void latir(){
        System.out.println("au au");
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
