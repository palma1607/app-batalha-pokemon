package br.com.unicuritiba.appbatalhapokemon;

public class Pokemon {

    public static int TERRA = 1;
    public static int ELETRICO = 2;
    public static int FOGO = 3;
    public static int AGUA = 4;
    public static int LUTADOR = 5;
    public static int PSIQUICO = 6;


    private String nome;

    private int elemento;

    private int hp;

    private int ataque;

    private  int defesa;

    private String imagemFrente;

    private String imagemCosta;

    public Pokemon(String nome, int elemento, int hp, int ataque, int defesa, String imagemFrente, String imagemCosta) {
        this.nome = nome;
        this.elemento = elemento;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.imagemFrente = imagemFrente;
        this.imagemCosta = imagemCosta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getImagemFrente() {
        return imagemFrente;
    }

    public void setImagemFrente(String imagemFrente) {
        this.imagemFrente = imagemFrente;
    }

    public String getImagemCosta() {
        return imagemCosta;
    }

    public void setImagemCosta(String imagemCosta) {
        this.imagemCosta = imagemCosta;
    }
}
