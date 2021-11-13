package Onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="customertable")
  

public class customer {
	
	
	@Id
	private int cid;
	private String cname;
	private String cmobile;
	private String caddress;
	
	
public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCmobile() {
		return cmobile;
	}


	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}


	public String getCaddress() {
		return caddress;
	}


	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}


	public List<orders> getOrders() {
		return orders;
	}


	public void setOrders(List<orders> orders) {
		this.orders = orders;
	}


@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="cid")
	private List<orders> orders;

	
	
	
	
	
}
