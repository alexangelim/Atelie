package Atelie.model.vo;

import Atelie.model.dto.EnderecoClienteDto;
import java.util.ArrayList;

public class ClienteVO {
    
    private int id = 0;
    private String nome = "";
    private String email = "";
    private String dataCadastro = "";
    private String telefone = "";
    private String celular = "";
    private ArrayList<EnderecoClienteDto> vEndereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<EnderecoClienteDto> getvEndereco() {
        return vEndereco;
    }

    public void setvEndereco(ArrayList<EnderecoClienteDto> vEndereco) {
        this.vEndereco = vEndereco;
    }
    
    
}
