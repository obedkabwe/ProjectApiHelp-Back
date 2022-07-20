package com.obedkabwe.help.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Embeddable
public class ItemPedidoPk implements Serializable{
	private static final long serialVersionUID = 1L;
    
	@ManyToOne
	@JoinColumn(name = "pedido")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "produto")
	private Produto produto;

	public Pedido getPedido() {
		return pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pedido, produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedidoPk other = (ItemPedidoPk) obj;
		return Objects.equals(pedido, other.pedido) && Objects.equals(produto, other.produto);
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
	
	
	
}
