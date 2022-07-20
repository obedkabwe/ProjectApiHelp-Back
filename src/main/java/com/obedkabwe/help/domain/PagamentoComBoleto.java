package com.obedkabwe.help.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.obedkabwe.help.domain.ennums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@JsonFormat(pattern= "dd/MM/yyyy")
	private Date dataVencimento;
	
	
	@JsonFormat(pattern= "dd/MM/yyyy")
	private Date dataPagamento;
	
	
	public PagamentoComBoleto() {
		
	}


	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	public Date getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
	
	
	
	
}
