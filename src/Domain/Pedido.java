package Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
	private Produto idProduto;
	private int qtd;
	private Double total;
	private Double entrada;
	private int parcela;
	
	
	public Pedido(Object object, Produto p1, int i, double d, double e, int j) {
	
	}

	public int getNroPedido() {
		return Id;
	}

	public void setNroPedido(int nroPedido) {
		this.Id = nroPedido;
	}

	public Produto getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Produto idProduto) {
		this.idProduto = idProduto;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getEntrada() {
		return entrada;
	}

	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public Pedido(int nroPedido, Produto idProduto, int qtd, Double total, Double entrada, int parcela) {
		super();
		this.Id = nroPedido;
		this.idProduto = idProduto;
		this.qtd = qtd;
		this.total = total;
		this.entrada = entrada;
		this.parcela = parcela;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
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
		Pedido other = (Pedido) obj;
		if (Id != other.Id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [nroPedido=" + Id + ", idProduto=" + idProduto + ", qtd=" + qtd + ", total=" + total
				+ ", entrada=" + entrada + ", parcela=" + parcela + "]";
	}
	
	
}
