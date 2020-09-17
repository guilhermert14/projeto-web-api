package br.com.commons;

public class VariaveisEstaticas {

    static String titleProduto;
    static String nome;
    static int id;
    static int latitude;
    static int longitude;
    static String pais;
    static int qtd;

    public static String getTitleProduto() {
        return titleProduto;
    }

    public static void setTitleProduto(String titleProduto) {
        VariaveisEstaticas.titleProduto = titleProduto;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        VariaveisEstaticas.nome = nome;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        VariaveisEstaticas.id = id;
    }

    public static int getLatitude() {
        return latitude;
    }

    public static void setLatitude(int latitude) {
        VariaveisEstaticas.latitude = latitude;
    }

    public static int getLongitude() {
        return longitude;
    }

    public static void setLongitude(int longitude) {
        VariaveisEstaticas.longitude = longitude;
    }

    public static String getPais() {
        return pais;
    }

    public static void setPais(String pais) {
        VariaveisEstaticas.pais = pais;
    }

    public static int getQtd() {
        return qtd;
    }

    public static void setQtd(int qtd) {
        VariaveisEstaticas.qtd = qtd;
    }
}
