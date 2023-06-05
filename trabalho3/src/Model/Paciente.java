 package Model;

import java.util.Date;

public abstract class Paciente {
    private int tipo;
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private String sexo;
    private String profissao;
    private Telefone telefone;
    private int nivelDor;

    public Paciente(String nome, Date dataNascimento, String sexo, Endereco endereco,
                    String profissao, Telefone telefone, int nivelDor, int tipo ) {
        this.nome = nome;       
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.endereco = new Endereco(endereco);
        this.profissao = profissao;
        this.telefone = telefone;
        this.nivelDor = nivelDor;
        this.tipo = tipo;
    }
    
    public abstract void MetodoPagamento();

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public int getNivelDor() {
        return nivelDor;
    }

    public void setNivelDor(int nivelDor) {
        this.nivelDor = nivelDor;
    }
}

