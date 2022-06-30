package br.com.bytefood.system.model;

import javax.persistence.*;

@Entity
@set
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;

    public Cliente(Long id, String nome, String endereco, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Long getId() {
        return id;
    }

}
