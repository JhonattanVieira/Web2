package br.ufscar.dc.dsw.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
 
@Entity
@NamedQueries({@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome")})
public class Usuario implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
    private String cpf;
    private String nome;
    private String telefone;
    private String sexo;
    private String nascimento;
    
 
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha (String senha){
        this.senha = senha;
    }
    
    public String getCpf (){
        return cpf;
    }
    
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
            
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
 
    public void setTelefone(String telefone) {
        this.nome = telefone;
    }
    
    public String getSexo() {
        return sexo;
    }
 
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getNascimento() {
        return nascimento;
    }
 
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
 
    @Override
    public String toString() {
        return nome;
    }
}

