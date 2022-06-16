package com.obedkabwe.help.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.obedkabwe.help.domain.ennums.TipoCliente;

public class Cliente {

	
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private Integer  tipo; 
	
	
	private List<Enderco> enderocos = new ArrayList<>();
	
	private Set<String> telefones = new HashSet<>();


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}


	public Cliente() {
		super();
	}


	


	public Cliente(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipo = tipo.getCod();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
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


	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}


	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}


	public TipoCliente getTipo() {
		return TipoCliente.toEnum(tipo);
	}


	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo.getCod();
	}


	public List<Enderco> getEnderocos() {
		return enderocos;
	}


	public void setEnderocos(List<Enderco> enderocos) {
		this.enderocos = enderocos;
	}


	public Set<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
