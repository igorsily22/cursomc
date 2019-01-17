package com.br.igorsily.cursomc.model.Pagamento;

import java.util.Date;

import javax.persistence.Entity;

import com.br.igorsily.cursomc.model.enums.EstadoPagamento;
import com.br.igorsily.cursomc.model.pedido.Pedido;

@Entity
public class PagamentoBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;

	private Date dataVencimento;

	private Date dataPagamento;

	public PagamentoBoleto() {
	}

	public PagamentoBoleto(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, estadoPagamento, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;

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