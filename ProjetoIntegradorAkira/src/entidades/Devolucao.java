package entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Devolucao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double valorTotal;
	private boolean statusPagamento;
	private Date dtRealDevolucao;
	private boolean estaDanificado;
	@OneToOne
	private Locacao locacao;
	
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	public Date getDtRealDevolucao() {
		return dtRealDevolucao;
	}
	public void setDtRealDevolucao(Date dtRealDevolucao) {
		this.dtRealDevolucao = dtRealDevolucao;
	}
	public boolean isEstaDanificado() {
		return estaDanificado;
	}
	public void setEstaDanificado(boolean estaDanificado) {
		this.estaDanificado = estaDanificado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtRealDevolucao == null) ? 0 : dtRealDevolucao.hashCode());
		result = prime * result + (estaDanificado ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((locacao == null) ? 0 : locacao.hashCode());
		result = prime * result + (statusPagamento ? 1231 : 1237);
		result = prime * result + ((valorTotal == null) ? 0 : valorTotal.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Devolucao other = (Devolucao) obj;
		if (dtRealDevolucao == null) {
			if (other.dtRealDevolucao != null)
				return false;
		} else if (!dtRealDevolucao.equals(other.dtRealDevolucao))
			return false;
		if (estaDanificado != other.estaDanificado)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (locacao == null) {
			if (other.locacao != null)
				return false;
		} else if (!locacao.equals(other.locacao))
			return false;
		if (statusPagamento != other.statusPagamento)
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}
	
	
}
