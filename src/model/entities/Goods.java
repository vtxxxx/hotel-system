package model.entities;

import java.io.Serializable;

public class Goods implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Double productPrice;
	private Double productPurchase;
	
	/* private Double downProfit;
	private Double upProfit;
	 */
	
	public Goods() {
		
	}
	
	public Goods(Integer id, String name, Double productPrice, Double productPurchase) {
		this.id = id;
		this.name = name;
		this.productPrice = productPrice;
		this.productPurchase = productPurchase;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Double getProductPurchase() {
		return productPurchase;
	}
	public void setProductPurchase(Double productPurchase) {
		this.productPurchase = productPurchase;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Goods other = (Goods) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goods [id = " + id + ", name = " + name + ", Price = " + productPrice + "]";
	}
	
}
