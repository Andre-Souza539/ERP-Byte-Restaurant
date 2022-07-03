package br.com.bytefood.system.model;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;

    private String telefone;

    private String cep;

    private String bairro;
    private String rua;
    private int num;

    private String cargo;
    private double salario;
    private double transporte;
    private double alimentacao;

    public long getId() { return this.id; }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return num;
    }

    public void setNumero(int num) {
        this.num = num;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTransporte() {
        return transporte;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }

    public double getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(double alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

