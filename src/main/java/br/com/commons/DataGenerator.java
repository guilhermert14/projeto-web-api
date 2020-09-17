package br.com.commons;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {

    private String nomeCompleto;
    private String nome;
    private String sobrenome;
    private String email;
    private String celular;
    private String senha;

    public DataGenerator() {
        Faker faker = new Faker(new Locale("pt-BR"));

        this.setNomeCompleto(faker.name().fullName());
        this.setNome(faker.name().firstName());
        this.setSobrenome(faker.name().lastName());
        this.setEmail(faker.internet().emailAddress());
        this.setCelular(faker.phoneNumber().cellPhone());
        this.setSenha(faker.internet().password(8, 20));
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    private void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    private void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    private void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
