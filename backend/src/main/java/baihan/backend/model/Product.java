package baihan.backend.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")

public class Product {
	@Id
	private long eanCode;
	
	@OrderBy("id DESC")
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<Comment> comment;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long eanCode, String name, String description, String brand, float price, String picture) {
		super();
		this.eanCode = eanCode;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.picture = picture;
	}
	public long getEanCode() {
		return eanCode;
	}
	public void setEanCode(long eanCode) {
		this.eanCode = eanCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	private String name;
	public List<Comment> getComment() {
		return comment;
	}
	public int getQuantity() {
		return quantity;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	private String description;
	private String brand;
	private float price;
	private String picture;
	private int quantity;
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
	private Customer customer;
}
