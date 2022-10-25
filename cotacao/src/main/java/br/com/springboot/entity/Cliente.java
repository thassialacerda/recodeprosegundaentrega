package br.com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes_dtls")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "cliente_nome")
	private String nome;
	
	private String email;
	private String endereco;
	private String cep;
	private String destino;
	private String quantidade;
	private String formapag;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nome, String email, String endereco, String cep, String destino, String quantidade,
			String formapag) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.cep = cep;
		this.destino = destino;
		this.quantidade = quantidade;
		this.formapag = formapag;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getFormapag() {
		return formapag;
	}
	public void setFormapag(String formapag) {
		this.formapag = formapag;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", cep=" + cep
				+ ", destino=" + destino + ", quantidade=" + quantidade + ", formapag=" + formapag + "]";
	}
	
	
}
