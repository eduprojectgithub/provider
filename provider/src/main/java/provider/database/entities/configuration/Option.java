package provider.database.entities.configuration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CON_OPTION")
public class Option {
	
	@Id
	private int id;
	
	@Column(name="OPTION_NAME")
	private String name;
	
	@Column(name="OPTION_TYPE") //FIXME
	private int type;
	
	@Column(name="PRICE")
	private float price;
	
	@Column(name="STATUS") //FIXME
	private int status;

	public Option(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
